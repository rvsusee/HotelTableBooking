package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2022-DEC-07  12:07:05 PM
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: 2023-FEB-02  06:05:52 PM
	 */
	public static final String BOOKING_DETAILS = "BookingDetails";
	public static final String CALL_HISTORY_INFO = "CallHistoryInfo";
	public static final String WAITING_TO_TRANSFER_CALL = "WaitingToTransferCall";
	public static final String VALIDATION = "validation";
	public static final String GET_TIME_PC = "GetTimePC";
	public static final String AUDIO_PATH = "audioPath";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String GET_DATE_PC = "GetDatePC";
	public static final String GET_BOOKING_NO_PC = "GetBookingNoPC";
	public static final String EXIT_LOCATION = "ExitLocation";
	public static final String DATE = "date";
	public static final String ENG_SUB_MENU = "EngSubMenu";
	public static final String ENG_MAIN_MENU = "EngMainMenu";
	public static final String CUSTOMER_DETAILS = "CustomerDetails";
	public static final String PIN_PC = "PinPC";
	public static final String GET_CONFIRM_OR_NOT = "GetConfirmOrNot";
	public static final String SESSION = "session";
	public static final String GET_NO_PERSON_PC = "GetNoPersonPC";
	public static final String MOBILE_NO = "MobileNo";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String LANGUAGE_MENU = "LanguageMenu";
	public static final String TIME = "time";
	public static final String SHAREDUUI = "shareduui";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String BOOKING_DETAILS_FIELD_BOOKING_NO = "BookingNo";
	public static final String BOOKING_DETAILS_FIELD_DATE = "Date";
	public static final String BOOKING_DETAILS_FIELD_MOBILE_NO = "MobileNo";
	public static final String BOOKING_DETAILS_FIELD_PERSONS = "Persons";
	public static final String BOOKING_DETAILS_FIELD_TIME = "Time";
	public static final String BOOKING_DETAILS_FIELD_TIME_VALIDATION = "TimeValidation";
	public static final String CALL_HISTORY_INFO_FIELD_DURATION = "duration";
	public static final String CALL_HISTORY_INFO_FIELD_END_DATE = "endDate";
	public static final String CALL_HISTORY_INFO_FIELD_END_REASON = "EndReason";
	public static final String CALL_HISTORY_INFO_FIELD_EXIT_LOCATION = "ExitLocation";
	public static final String CALL_HISTORY_INFO_FIELD_IP = "ip";
	public static final String CALL_HISTORY_INFO_FIELD_START_DATE = "startDate";
	public static final String VALIDATION_FIELD_ATTEMPT_COUNT = "attemptCount";
	public static final String VALIDATION_FIELD_IS_API_CONNECT = "isApiConnect";
	public static final String VALIDATION_FIELD_IS_EXIST_CUSTOMER = "isExistCustomer";
	public static final String VALIDATION_FIELD_IS_HAVE_LAST_BOOKING = "isHaveLastBooking";
	public static final String VALIDATION_FIELD_IS_LOGIN = "isLogin";
	public static final String VALIDATION_FIELD_IS_NO_OF_PERSON = "isNoOfPerson";
	public static final String VALIDATION_FIELD_IS_PAST_DATE = "isPastDate";
	public static final String VALIDATION_FIELD_IS_VALID_BOOKING_NO = "isValidBookingNo";
	public static final String VALIDATION_FIELD_IS_VALID_DATE = "isValidDate";
	public static final String VALIDATION_FIELD_IS_VALID_DATE_TIME = "isValidDateTime";
	public static final String VALIDATION_FIELD_IS_VALID_TIME = "isValidTime";
	public static final String GET_TIME_PC_FIELD_CONFIDENCE = "confidence";
	public static final String GET_TIME_PC_FIELD_INPUTMODE = "inputmode";
	public static final String GET_TIME_PC_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_TIME_PC_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_TIME_PC_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_TIME_PC_FIELD_UTTERANCE = "utterance";
	public static final String GET_TIME_PC_FIELD_VALUE = "value";
	public static final String AUDIO_PATH_FIELD_EXIST_CUSTOMER_ENTER_PIN = "ExistCustomerEnterPin";
	public static final String AUDIO_PATH_FIELD_NEW_CUSTOMER_ENTER_PIN = "NewCustomerEnterPin";
	public static final String AUDIO_PATH_FIELD_TESTING = "testing";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String GET_DATE_PC_FIELD_CONFIDENCE = "confidence";
	public static final String GET_DATE_PC_FIELD_INPUTMODE = "inputmode";
	public static final String GET_DATE_PC_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_DATE_PC_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_DATE_PC_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_DATE_PC_FIELD_UTTERANCE = "utterance";
	public static final String GET_DATE_PC_FIELD_VALUE = "value";
	public static final String GET_BOOKING_NO_PC_FIELD_CONFIDENCE = "confidence";
	public static final String GET_BOOKING_NO_PC_FIELD_INPUTMODE = "inputmode";
	public static final String GET_BOOKING_NO_PC_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_BOOKING_NO_PC_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_BOOKING_NO_PC_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_BOOKING_NO_PC_FIELD_UTTERANCE = "utterance";
	public static final String GET_BOOKING_NO_PC_FIELD_VALUE = "value";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String ENG_SUB_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String ENG_SUB_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String ENG_SUB_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String ENG_SUB_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENG_SUB_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENG_SUB_MENU_FIELD_UTTERANCE = "utterance";
	public static final String ENG_SUB_MENU_FIELD_VALUE = "value";
	public static final String ENG_MAIN_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String ENG_MAIN_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String ENG_MAIN_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String ENG_MAIN_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String ENG_MAIN_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String ENG_MAIN_MENU_FIELD_UTTERANCE = "utterance";
	public static final String ENG_MAIN_MENU_FIELD_VALUE = "value";
	public static final String CUSTOMER_DETAILS_FIELD_EMAIL_ID = "emailId";
	public static final String CUSTOMER_DETAILS_FIELD_ID = "id";
	public static final String CUSTOMER_DETAILS_FIELD_MOBILE_NUMBER = "mobileNumber";
	public static final String CUSTOMER_DETAILS_FIELD_NAME = "name";
	public static final String CUSTOMER_DETAILS_FIELD_PIN = "pin";
	public static final String PIN_PC_FIELD_CONFIDENCE = "confidence";
	public static final String PIN_PC_FIELD_INPUTMODE = "inputmode";
	public static final String PIN_PC_FIELD_INTERPRETATION = "interpretation";
	public static final String PIN_PC_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String PIN_PC_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String PIN_PC_FIELD_UTTERANCE = "utterance";
	public static final String PIN_PC_FIELD_VALUE = "value";
	public static final String GET_CONFIRM_OR_NOT_FIELD_CONFIDENCE = "confidence";
	public static final String GET_CONFIRM_OR_NOT_FIELD_INPUTMODE = "inputmode";
	public static final String GET_CONFIRM_OR_NOT_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_CONFIRM_OR_NOT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_CONFIRM_OR_NOT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_CONFIRM_OR_NOT_FIELD_UTTERANCE = "utterance";
	public static final String GET_CONFIRM_OR_NOT_FIELD_VALUE = "value";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PARENT_ID = "exitParentId";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String GET_NO_PERSON_PC_FIELD_CONFIDENCE = "confidence";
	public static final String GET_NO_PERSON_PC_FIELD_INPUTMODE = "inputmode";
	public static final String GET_NO_PERSON_PC_FIELD_INTERPRETATION = "interpretation";
	public static final String GET_NO_PERSON_PC_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GET_NO_PERSON_PC_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GET_NO_PERSON_PC_FIELD_UTTERANCE = "utterance";
	public static final String GET_NO_PERSON_PC_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String LANGUAGE_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String LANGUAGE_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String LANGUAGE_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String LANGUAGE_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String LANGUAGE_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String LANGUAGE_MENU_FIELD_UTTERANCE = "utterance";
	public static final String LANGUAGE_MENU_FIELD_VALUE = "value";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
