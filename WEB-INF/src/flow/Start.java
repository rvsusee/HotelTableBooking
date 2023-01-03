package flow;

/**
 * This is a special reserved class that is repsonsible for loading application 
 * variables as well as the forward to the actual first form of the application.<br>
 * This class should not be manually edited as changes may be overridden by the 
 * code generator.<br>
 * Last generated by Orchestration Designer at: 2022-DEC-07  12:07:05 PM
 */
public class Start extends com.avaya.sce.runtime.Entry {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2022-DEC-07  12:07:05 PM
	 */
	public Start() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically.  Any changes may be overwritten.
	 * Returns the submit object that will redirect application flow to the first
	 * form in the application.  This also adds various standard variables to the
	 * list of data to be submitted to the runtime variable table.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 * @return the Submit object that contains the standard variables and the first form
	 */
	public com.avaya.sce.runtime.Submit getSubmit(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Submit submit = new com.avaya.sce.runtime.Submit("WelcomeAcmt");
		return ( submit );
	}
	/**
	 * This method initializes the SCE session with the variables that
	 * are defined in the application.<BR>
	 * 
	 * This method is generated automatically and should not be manually
	 * edited because changes may be overwritten by future code 
	 * generation.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public void initializeVariables(com.avaya.sce.runtimecommon.SCESession session) {
		com.avaya.sce.runtimecommon.IVariable variable = null;
		String[] variableFields = null;

		variableFields = new String[] {
			IProjectVariables.BOOKING_DETAILS_FIELD_BOOKING_NO,
			IProjectVariables.BOOKING_DETAILS_FIELD_DATE,
			IProjectVariables.BOOKING_DETAILS_FIELD_DATE_VALIDATION,
			IProjectVariables.BOOKING_DETAILS_FIELD_DURATION,
			IProjectVariables.BOOKING_DETAILS_FIELD_MOBILE_NO,
			IProjectVariables.BOOKING_DETAILS_FIELD_PERSONS,
			IProjectVariables.BOOKING_DETAILS_FIELD_TIME,
			IProjectVariables.BOOKING_DETAILS_FIELD_TIME_VALIDATION };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.BOOKING_DETAILS, variableFields, new String[] {"10304050", "", "no", "", "8838930954", "", "", "no"}, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.ATTEMPT_FIELD_CANCEL_BOOKING_ATMT };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.ATTEMPT, variableFields, new String[] {"1"}, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.WAITING_TO_TRANSFER_CALL, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_DURATION_PC_FIELD_CONFIDENCE,
			IProjectVariables.GET_DURATION_PC_FIELD_INPUTMODE,
			IProjectVariables.GET_DURATION_PC_FIELD_INTERPRETATION,
			IProjectVariables.GET_DURATION_PC_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_DURATION_PC_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_DURATION_PC_FIELD_UTTERANCE,
			IProjectVariables.GET_DURATION_PC_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_DURATION_PC, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.VALIDATION_FIELD_CANCEL_BOOKING_VALIDATION,
			IProjectVariables.VALIDATION_FIELD_DELETE_SUCCESS };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.VALIDATION, variableFields, new String[] {"false", "false"}, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_TIME_PC_FIELD_CONFIDENCE,
			IProjectVariables.GET_TIME_PC_FIELD_INPUTMODE,
			IProjectVariables.GET_TIME_PC_FIELD_INTERPRETATION,
			IProjectVariables.GET_TIME_PC_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_TIME_PC_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_TIME_PC_FIELD_UTTERANCE,
			IProjectVariables.GET_TIME_PC_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_TIME_PC, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REDIRECTINFO_FIELD_PRESENTATIONINFO,
			IProjectVariables.REDIRECTINFO_FIELD_REASON,
			IProjectVariables.REDIRECTINFO_FIELD_SCREENINGINFO,
			IProjectVariables.REDIRECTINFO_FIELD_URI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REDIRECTINFO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_DATE_PC_FIELD_CONFIDENCE,
			IProjectVariables.GET_DATE_PC_FIELD_INPUTMODE,
			IProjectVariables.GET_DATE_PC_FIELD_INTERPRETATION,
			IProjectVariables.GET_DATE_PC_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_DATE_PC_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_DATE_PC_FIELD_UTTERANCE,
			IProjectVariables.GET_DATE_PC_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_DATE_PC, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.BOOKING_IS_FOUND, "false", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_CONFIDENCE,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_INPUTMODE,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_INTERPRETATION,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_UTTERANCE,
			IProjectVariables.GET_BOOKING_NO_PC_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_BOOKING_NO_PC, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.WELCOME_AUDIO, "C:/Users/User/Desktop/WelcomeAcmt.au", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DATE_FIELD_AUDIO,
			IProjectVariables.DATE_FIELD_DAYOFMONTH,
			IProjectVariables.DATE_FIELD_DAYOFWEEK,
			IProjectVariables.DATE_FIELD_DAYOFWEEKNUM,
			IProjectVariables.DATE_FIELD_DAYOFYEAR,
			IProjectVariables.DATE_FIELD_MONTH,
			IProjectVariables.DATE_FIELD_MONTHINYEAR,
			IProjectVariables.DATE_FIELD_YEAR };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.ENG_SUB_MENU_FIELD_CONFIDENCE,
			IProjectVariables.ENG_SUB_MENU_FIELD_INPUTMODE,
			IProjectVariables.ENG_SUB_MENU_FIELD_INTERPRETATION,
			IProjectVariables.ENG_SUB_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.ENG_SUB_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.ENG_SUB_MENU_FIELD_UTTERANCE,
			IProjectVariables.ENG_SUB_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.ENG_SUB_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.ENG_MAIN_MENU_FIELD_CONFIDENCE,
			IProjectVariables.ENG_MAIN_MENU_FIELD_INPUTMODE,
			IProjectVariables.ENG_MAIN_MENU_FIELD_INTERPRETATION,
			IProjectVariables.ENG_MAIN_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.ENG_MAIN_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.ENG_MAIN_MENU_FIELD_UTTERANCE,
			IProjectVariables.ENG_MAIN_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.ENG_MAIN_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_CONFIDENCE,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_INPUTMODE,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_INTERPRETATION,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_UTTERANCE,
			IProjectVariables.GET_CONFIRM_OR_NOT_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_CONFIRM_OR_NOT, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SESSION_FIELD_AAI,
			IProjectVariables.SESSION_FIELD_ANI,
			IProjectVariables.SESSION_FIELD_CALLTAG,
			IProjectVariables.SESSION_FIELD_CHANNEL,
			IProjectVariables.SESSION_FIELD_CHANNELTYPE,
			IProjectVariables.SESSION_FIELD_CONVERSEFIRST,
			IProjectVariables.SESSION_FIELD_CONVERSESECOND,
			IProjectVariables.SESSION_FIELD_CURRENTLANGUAGE,
			IProjectVariables.SESSION_FIELD_DNIS,
			IProjectVariables.SESSION_FIELD_EXIT_CUSTOMER_ID,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_1,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_2,
			IProjectVariables.SESSION_FIELD_EXIT_PARENT_ID,
			IProjectVariables.SESSION_FIELD_EXIT_PREFERRED_PATH,
			IProjectVariables.SESSION_FIELD_EXIT_REASON,
			IProjectVariables.SESSION_FIELD_EXIT_TOPIC,
			IProjectVariables.SESSION_FIELD_LASTERROR,
			IProjectVariables.SESSION_FIELD_MEDIATYPE,
			IProjectVariables.SESSION_FIELD_PROTOCOLNAME,
			IProjectVariables.SESSION_FIELD_PROTOCOLVERSION,
			IProjectVariables.SESSION_FIELD_SESSIONID,
			IProjectVariables.SESSION_FIELD_SESSIONLABEL,
			IProjectVariables.SESSION_FIELD_SHAREDMODE,
			IProjectVariables.SESSION_FIELD_UCID,
			IProjectVariables.SESSION_FIELD_UUI,
			IProjectVariables.SESSION_FIELD_VIDEOBITRATE,
			IProjectVariables.SESSION_FIELD_VIDEOCODEC,
			IProjectVariables.SESSION_FIELD_VIDEOENABLED,
			IProjectVariables.SESSION_FIELD_VIDEOFARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOFORMAT,
			IProjectVariables.SESSION_FIELD_VIDEOFPS,
			IProjectVariables.SESSION_FIELD_VIDEOHEIGHT,
			IProjectVariables.SESSION_FIELD_VIDEONEARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOWIDTH,
			IProjectVariables.SESSION_FIELD_VPCALLEDEXTENSION,
			IProjectVariables.SESSION_FIELD_VPCONVERSEONDATA,
			IProjectVariables.SESSION_FIELD_VPCOVERAGEREASON,
			IProjectVariables.SESSION_FIELD_VPCOVERAGETYPE,
			IProjectVariables.SESSION_FIELD_VPRDNIS,
			IProjectVariables.SESSION_FIELD_VPREPORTURL };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SESSION, variableFields, null, session, false, true );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.BOOKING_NOIS_FOUND, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GET_NO_PERSON_PC_FIELD_CONFIDENCE,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_INPUTMODE,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_INTERPRETATION,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_NOINPUTCOUNT,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_NOMATCHCOUNT,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_UTTERANCE,
			IProjectVariables.GET_NO_PERSON_PC_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GET_NO_PERSON_PC, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_ERRORCODE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_MESSAGE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_OBJECT,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_STACKTRACE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_TYPE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DD_LAST_EXCEPTION, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.LANGUAGE_MENU_FIELD_CONFIDENCE,
			IProjectVariables.LANGUAGE_MENU_FIELD_INPUTMODE,
			IProjectVariables.LANGUAGE_MENU_FIELD_INTERPRETATION,
			IProjectVariables.LANGUAGE_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.LANGUAGE_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.LANGUAGE_MENU_FIELD_UTTERANCE,
			IProjectVariables.LANGUAGE_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.LANGUAGE_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TIME_FIELD_AUDIO,
			IProjectVariables.TIME_FIELD_HOUR,
			IProjectVariables.TIME_FIELD_MILLISECOND,
			IProjectVariables.TIME_FIELD_MINUTE,
			IProjectVariables.TIME_FIELD_SECOND,
			IProjectVariables.TIME_FIELD_TIMEZONE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TIME, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SHAREDUUI_FIELD_ID,
			IProjectVariables.SHAREDUUI_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SHAREDUUI, variableFields, null, session, false, false );
		session.putVariable(variable);
	}
	/**
	 * This method returns the name of the application.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public String getEntryName() {
		return("HotelTableBooking");
	}
	/**
	 * This method returns a list of life cycle classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public java.util.Collection getPluggableLifeCycle() {
		java.util.ArrayList result = new java.util.ArrayList();
		return(result);
	}
	/**
	 * This method returns a list of VXML contributor classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public java.util.Collection getPluggableVXMLContrib() {
		java.util.ArrayList result = new java.util.ArrayList();
		return(result);
	}
	/**
	 * This method returns the root document for the application.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public String getRootDoc() {
		return("AppRoot");
	}
	/**
	 * This method returns a boolean to indicate if the approot node has a web page to show.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public boolean hasWebPage(com.avaya.sce.runtimecommon.SCESession mySession) {
		return false;
	}
	/**
	 * Builds the list of input parameters that are defined for this application 
	 * entry.  This list is built automatically by adding Input Parameter
	 * nodes to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>java.lang.String</code> objects that
	 * are the names of parameters the application is expecting.
	 * If the AppRoot node does not have any input parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
	/**
	 * Builds the list of capture expression that are defined for this application 
	 * entry.  This list is built automatically by adding Capture Expression
	 * items to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>CaptureExpression</code> objects that
	 * specify the ECMA script expression and the Orchestration Designer 
	 * session variable that will store the captured result.
	 * If the AppRoot node does not have any capture expression items, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: 2023-JAN-03  02:43:26 PM
	 */
	public java.util.Collection getCaptureExpressions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
}
