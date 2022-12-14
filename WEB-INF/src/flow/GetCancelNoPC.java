package flow;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: 2022-DEC-08  01:15:39 PM
 */
public class GetCancelNoPC extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2022-DEC-08  01:15:39 PM
	 */
	public GetCancelNoPC() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2023-JAN-11  10:53:03 AM
	 */
	protected String getSubflowName() {
		return("GetBookingNo");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-11  10:53:03 AM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("GetBookingNo-CorrectBkNo", "DeleteBkFromDB");
		exitPoints.put("GetBookingNo-atmtEnd", "EngMainMenu");
		return exitPoints;
	}
	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "GetCancelNoPC Node", mySession);
	}
}
