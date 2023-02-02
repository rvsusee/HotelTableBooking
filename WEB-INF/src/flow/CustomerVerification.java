package flow;

import org.json.JSONException;
import org.json.JSONObject;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import hotel.table.booking.dao.WebService;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing
 * mathematic operations, and collection iteration), conditional evaluation to
 * control callflow execution based on variable values, and logging/tracing
 * statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted. If no "true"
 * conditions are encountered, then all data actions will be executed/evaluated
 * and the application will proceed to the "Default" servlet. Last generated by
 * Orchestration Designer at: 2023-JAN-31 12:31:49 PM
 */
public class CustomerVerification extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2023-JAN-31
	 * 12:31:49 PM
	 */
	public CustomerVerification() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-FEB-02  06:05:52 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}

	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-02  06:05:52 PM
	 */
	public java.util.Collection<VariableInfo> getLocalVariables(){
		java.util.Collection<VariableInfo> variables = new java.util.ArrayList<VariableInfo>();

		return variables;
	}

	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-02  06:05:52 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(1);
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "validation:isApiConnect", com.avaya.sce.runtime.Expression.STRING_EQUAL, "true", false).setDebugId(740)).evaluate(mySession)) {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("PinPC", "ApiConnect").setDebugId(743));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		} else {
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("UnableToServe", "ApiNotConnect").setDebugId(736));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}

	@Override
	public void requestBegin(SCESession mySession) {
		super.requestBegin(mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "CustomerVerification Node Started", mySession);
		try {
			WebService service = new WebService(mySession);
			String mobileNumber = mySession
					.getVariableField(IProjectVariables.SESSION, IProjectVariables.SESSION_FIELD_ANI).getStringValue();
			JSONObject response = service.doGet("customer/getExistCustomer/" + mobileNumber);
			if (response != null) {
				if (response.getInt("httpStatus") == 202) {
					// is Exist Customer
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Existing Customer", mySession);

					JSONObject customer = null;
					customer = new JSONObject(response.getString("responseBody"));
					// set existing customer details from iproject variable
					mySession.getVariableField(IProjectVariables.CUSTOMER_DETAILS,
							IProjectVariables.CUSTOMER_DETAILS_FIELD_ID).setValue(customer.getInt("id"));
					mySession
							.getVariableField(IProjectVariables.CUSTOMER_DETAILS,
									IProjectVariables.CUSTOMER_DETAILS_FIELD_ID)
							.setValue(customer.getLong(("mobileNumber")));
					mySession.getVariableField(IProjectVariables.CUSTOMER_DETAILS,
							IProjectVariables.CUSTOMER_DETAILS_FIELD_PIN).setValue(customer.getString("pin"));

					mySession.getVariableField(IProjectVariables.VALIDATION,
							IProjectVariables.VALIDATION_FIELD_IS_EXIST_CUSTOMER).setValue(true);
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Existing Customer Details : " + customer, mySession);

				} else {
					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "New Customer", mySession);
//					JSONObject responseBody = new JSONObject(response.getString("responseBody"));

					TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Response : " + response.toString(), mySession);

					mySession.getVariableField(IProjectVariables.VALIDATION,
							IProjectVariables.VALIDATION_FIELD_IS_EXIST_CUSTOMER).setValue(false);
				}
				mySession.getVariableField(IProjectVariables.VALIDATION,
						IProjectVariables.VALIDATION_FIELD_IS_API_CONNECT).setValue(true);
			} else {
				// new Customer
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Exception Occured", mySession);

				mySession.getVariableField(IProjectVariables.VALIDATION,
						IProjectVariables.VALIDATION_FIELD_IS_EXIST_CUSTOMER).setValue(false);
				mySession.getVariableField(IProjectVariables.VALIDATION,
						IProjectVariables.VALIDATION_FIELD_IS_API_CONNECT).setValue(false);
			}
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "CustomerVerification Node Ended", mySession);
		} catch (JSONException err) {
			mySession.getVariableField(IProjectVariables.VALIDATION, IProjectVariables.VALIDATION_FIELD_IS_API_CONNECT)
					.setValue(false);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "JSONException : " + err.getLocalizedMessage(), mySession);
		} catch (Exception err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "Exception : " + err.getLocalizedMessage(), mySession);
			mySession.getVariableField(IProjectVariables.VALIDATION, IProjectVariables.VALIDATION_FIELD_IS_API_CONNECT)
					.setValue(false);
		}
	}
}