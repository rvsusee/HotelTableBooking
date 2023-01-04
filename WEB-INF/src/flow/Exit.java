package flow;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

/**
 * Implements the return from an application. A Return class allows an
 * application to do some processing. If the application is invoked by another
 * application, then this class will define the parameters returned to the
 * calling application. Last generated by Orchestration Designer at: 2022-DEC-07
 * 12:09:34 PM
 */
public class Exit extends com.avaya.sce.runtime.Return {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-07
	 * 12:09:34 PM
	 */
	public Exit() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Builds the list of output parameters that are returned by this application
	 * This list is built automatically by defining Output Parameter nodes in the
	 * call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Parameter</code>
	 * objects that the runtime will return to the calling application.
	 * If the node does not have any output parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2023-JAN-04  12:23:14 PM
	 */
	public java.util.Collection getOutputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Parameter param = null;
		list = new java.util.ArrayList();

		return list;
	}

	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Orchestration Designer at: 2023-JAN-04  12:23:14 PM
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		String ___tempPromptName = null;
		// Item has no prompts associated
		list = new java.util.ArrayList();

		return(list);
	}

	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Orchestration Designer at: 2023-JAN-04  12:23:14 PM
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no tracking items.
		list = new java.util.ArrayList();
		return(list);
	}

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Applcation Flow Ended", mySession);
	}
}
