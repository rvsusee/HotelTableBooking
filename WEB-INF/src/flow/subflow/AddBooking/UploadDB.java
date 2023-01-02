package flow.subflow.AddBooking;

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
 * Orchestration Designer at: 2022-DEC-12 01:14:42 PM
 */
public class UploadDB extends com.avaya.sce.runtime.Data {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-12
	 * 01:14:42 PM
	 */
	public UploadDB() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-02  02:29:44 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = new com.avaya.sce.runtime.Next("AddBooking-BookingConfirm");
		next.setDebugId(187);
		return next;
	}

	/**
	 * Create a list of local variables used by items in the data node.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-JAN-02  02:29:44 PM
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
	 * Last generated by Orchestration Designer at: 2023-JAN-02  02:29:44 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(3);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("BookingDetails:BookingNo", "", true).setDebugId(247));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "GetBookingNo", "Auto Generated Booking Number", "").setDebugId(131));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
	
	

//	@Override
//	public void requestBegin(SCESession mySession) {
//		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "UploadDB Node", mySession);
//		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties File started", mySession);
//		String path = "D:\\AVAYA Project\\HotelTableBooking\\data\\Database.properties";
//		String DBUrl, DBDriver, DBUserName, DBPassword;
//		try {
//			FileInputStream fileInput = new FileInputStream(new File(path));
//			Properties properties = new Properties();
//			properties.load(fileInput);
//			DBUrl = properties.getProperty("database.url");
//			DBDriver = properties.getProperty("database.driverClassName");
//			DBUserName = properties.getProperty("database.username");
//			DBPassword = properties.getProperty("database.password");
//			fileInput.close();
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO,
//					"\nDatas : " + DBUrl + " " + DBDriver + " " + DBUserName + " " + DBPassword, mySession);
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties File Ended", mySession);
//
//			dbOperation(DBUrl, DBDriver, DBUserName, DBPassword, mySession);
//
//		} catch (FileNotFoundException e) {
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties Failed : FileNotFound" + e.getMessage(),
//					mySession);
//		} catch (IOException e) {
//			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Access Properties Failed : IOException" + e.getMessage(),
//					mySession);
//			e.printStackTrace();
//		}
//	}
//
//	private void dbOperation(String DBUrl, String DBDriver, String DBUserName, String DBPassword,
//				SCESession mySession) {
//			try {
//				Class.forName(DBDriver);
//				Connection connection = DriverManager.getConnection(DBUrl, DBUserName, DBPassword);
//				Statement stmt = connection.createStatement();
//				String query = queryGenerate(mySession);
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Query :"+query, mySession);
//				stmt.execute(query);
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Database accessed succesfully", mySession);
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "New Booking Added successfully", mySession);
//				stmt.close();
//				connection.close();
//			} catch (SQLException e) {
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Unable to Connect Database" + e.getMessage(), mySession);
//			} catch (ClassNotFoundException e) {
//				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR,
//						"Unable to Connect Database - ClassNotFoundException" + e.getMessage(), mySession);
//			}
//	}
//
//	private String queryGenerate(SCESession mySession) {
//		int bookingNo = mySession.getVariableField(IProjectVariables.BOOKING_DETAILS,IProjectVariables.BOOKING_DETAILS_FIELD_BOOKING_NO).getIntValue();
//		int mobileNo = mySession.getVariableField(IProjectVariables.BOOKING_DETAILS,IProjectVariables.BOOKING_DETAILS_FIELD_MOBILE_NO).getIntValue();
//		String noPerson = mySession
//				.getVariableField(IProjectVariables.GET_NO_PERSON_PC, IProjectVariables.GET_NO_PERSON_PC_FIELD_VALUE)
//				.getStringValue();
//		String bkDate = mySession
//				.getVariableField(IProjectVariables.GET_DATE_PC, IProjectVariables.GET_DATE_PC_FIELD_VALUE)
//				.getStringValue();
//		String bkTime = mySession
//				.getVariableField(IProjectVariables.GET_TIME_PC, IProjectVariables.GET_TIME_PC_FIELD_VALUE)
//				.getStringValue();
//		String bkDuration = mySession
//				.getVariableField(IProjectVariables.GET_DURATION_PC, IProjectVariables.GET_DURATION_PC_FIELD_VALUE)
//				.getStringValue();
//		return "exec SUSEENDHIRAN_HOTEL_TABLE_BOOKING_UPLOAD_BK_DETAILS @bookingID = "+bookingNo+", @mobileNo = "+mobileNo+", @noPerson = "+noPerson+", @bkDate = "+bkDate+", @bkTime = "+bkTime+", @bkDuration = "+bkDuration+";";
//	}			
}