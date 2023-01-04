package flow.subflow.AddBooking;

import flow.IProjectVariables;

/**
 * A basic servlet which allows a user to define their code, generate any
 * output, and to select where to transition to next. Last generated by
 * Orchestration Designer at: 2022-DEC-15 10:26:05 AM
 */
public class ValidateTime extends com.avaya.sce.runtime.BasicServlet {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-15
	 * 10:26:05 AM
	 */
	public ValidateTime() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components. You may
	 * use Java for sophisticated logic or to integrate with custom connectors (i.e.
	 * JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent
	 * delays. It's important to design your callflow so that the voice browser
	 * (Experienve Portal/IR) is not waiting too long for a response as this can
	 * lead to a poor caller experience. Additionally, if the response to the client
	 * voice browser exceeds the configured timeout, the platform may throw an
	 * "error.badfetch".
	 *
	 * Using this method, you have access to all session variables through the
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future. Last
	 * generated by Orchestration Designer at: 2022-DEC-15 10:26:05 AM
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		String inputTimeString = mySession.getVariableField(IProjectVariables.GET_TIME_PC_FIELD_VALUE).getStringValue();
		System.out.println(inputTimeString);
//		try {
//			LocalTime.parse(inputTimeString);
//			mySession.getVariableField(IProjectVariables.BOOKING_DETAILS,
//					IProjectVariables.BOOKING_DETAILS_FIELD_TIME_VALIDATION).setValue("yes");
//		} catch (DateTimeParseException | NullPointerException e) {
//			mySession.getVariableField(IProjectVariables.BOOKING_DETAILS,
//					IProjectVariables.BOOKING_DETAILS_FIELD_TIME_VALIDATION).setValue("yes");
//		}
	}

	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2023-JAN-04  06:10:52 PM
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("AddBooking-dateValidator", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
