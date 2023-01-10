package flow;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

import hotel.table.booking.dao.ConnectionPooling;

/**
 * This servlet is used to forward the request to the entry point of a project
 * callflow (subflow). Last generated by Orchestration Designer at: 2022-DEC-07
 * 03:18:23 PM
 */
public class LastBookingDetails extends com.avaya.sce.runtime.Subflow {

	// {{START:CLASS:FIELDS
	// }}END:CLASS:FIELDS

	/**
	 * Default constructor Last generated by Orchestration Designer at: 2022-DEC-07
	 * 03:18:23 PM
	 */
	public LastBookingDetails() {
		// {{START:CLASS:CONSTRUCTOR
		super();
		// }}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: 2023-JAN-10  12:10:24 PM
	 */
	protected String getSubflowName() {
		return("BookingDetails");
	}

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow. Last
	 *         generated by Orchestration Designer at: 2022-DEC-26 02:49:23 PM
	 */

	@Override
	public void requestBegin(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "LastBookingDetails Node", mySession);
		ConnectionPooling cp = new ConnectionPooling(mySession);
		try {
			ResultSet rs = cp.getBookingDetails("exec HOTEL_GET_LASTBOOKINGDETAILS;");
			if (rs.next()) {
				setValues(rs.getInt("id"), rs.getInt("person_count"), rs.getDate("date_time"), rs.getDate("booking_on"),
						mySession);
			}
			rs.close();
		} catch (SQLException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Exception Occured in Last Booking Details " + e.toString(),
					mySession);
		}

	}

	private void setValues(int bookingNo, int noPerson, Date bookingDate, Date bookingOn, SCESession mySession) {
		mySession
				.getVariableField(IProjectVariables.BOOKING_DETAILS, IProjectVariables.BOOKING_DETAILS_FIELD_BOOKING_NO)
				.setValue(bookingNo);
		mySession.getVariableField(IProjectVariables.GET_NO_PERSON_PC, IProjectVariables.GET_NO_PERSON_PC_FIELD_VALUE)
				.setValue(noPerson);
		mySession.getVariableField(IProjectVariables.GET_NO_PERSON_PC, IProjectVariables.GET_NO_PERSON_PC_FIELD_VALUE)
				.setValue(bookingDate);
//		mySession.getVariableField(IProjectVariables.GET_NO_PERSON_PC, IProjectVariables.GET_NO_PERSON_PC_FIELD_VALUE)
//				.setValue(bookingTime);
	}

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow. Last
	 *         generated by Orchestration Designer at: 2023-JAN-07 02:47:54 PM
	 */

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow. Last
	 *         generated by Orchestration Designer at: 2023-JAN-07 06:17:11 PM
	 */

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-07  06:59:54 PM
	 */

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-09  11:48:07 AM
	 */

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-09  12:11:15 PM
	 */

	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: 2023-JAN-10  12:10:24 PM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("BookingDetails-Return", "EngSubMenu");
		return exitPoints;
	}
}
