package flow;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * This servlet is used to forward the request to the entry point of a project
 * callflow (subflow). Last generated by Orchestration Designer at: 2022-DEC-07
 * 01:21:12 PM
 */
public class AddBooking extends com.avaya.sce.runtime.Subflow {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-07
	 * 01:21:12 PM
	 */
	public AddBooking() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2023-JAN-07  06:59:54 PM
	 */
	protected String getSubflowName() {
		return("AddBooking");
	}

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow. Last
	 *         generated by Orchestration Designer at: 2022-DEC-19 10:59:42 AM
	 */

	
	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Add Booking Details Flow", mySession);
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2022-DEC-26  11:57:15 AM
	 */
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-07  06:59:54 PM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("AddBooking-Return", "EngMainMenu");
		exitPoints.put("AddBooking-MoreAtmtEnd", "Exit");
		return exitPoints;
	}
	
}