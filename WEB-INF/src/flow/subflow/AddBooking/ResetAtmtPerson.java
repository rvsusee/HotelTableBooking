package flow.subflow.AddBooking;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

/**
 * This servlet is used to forward the request to the entry point of a project
 * callflow (subflow). Last generated by Orchestration Designer at: 2022-DEC-17
 * 11:11:11 AM
 */
public class ResetAtmtPerson extends com.avaya.sce.runtime.Subflow {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-17
	 * 11:11:11 AM
	 */
	public ResetAtmtPerson() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2022-DEC-26  11:57:15 AM
	 */
	protected String getSubflowName() {
		return("AttemptReset");
	}

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow. Last
	 *         generated by Orchestration Designer at: 2022-DEC-17 05:44:30 PM
	 */
	protected java.util.Map<String, String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("AttemptReset-GoNext", "AddBooking-GetDatePC");
		return exitPoints;
	}

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "ResetAtmtPerson Node", mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_DEBUG, "ResetAtmtPerson Attempts : "
				+ mySession.getVariableField(IProjectVariables.ATTEMPT_COUNT).getStringValue(), mySession);
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2022-DEC-26  11:57:15 AM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("AttemptReset-GoNext", "AddBooking-GetDatePC");
		return exitPoints;
	}
}
