package hotel.table.booking;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class DateTimeValidation {
	LocalDate localDate;
	LocalDate inputDate;
	SCESession mySession;

	public DateTimeValidation(SCESession mySession) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Date Validation ", mySession);
		localDate = LocalDate.now(ZoneId.systemDefault());
		this.mySession = mySession;
	}

	public int dateValidation(String date, String dateFormat) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "User Entered Date: " + date, mySession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "Date Format: " + dateFormat, mySession);
//		3	-> Future
//		2	-> Today
//		1	-> Past
//		-1	-> wrong date Format
		inputDate = convertDate(date, dateFormat);

		if (inputDate != null) {
			if (isDateFuture(inputDate))
				return 3;
			else if (isDateToday(inputDate))
				return 2;
			else if (isDatePast(inputDate)) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	private boolean isDateFuture(LocalDate inputDate) {
		return inputDate.isAfter(localDate);
	}

	private boolean isDateToday(LocalDate inputDate) {
		return inputDate.isEqual(localDate);
	}

	private boolean isDatePast(LocalDate inputDate) {
		return inputDate.isBefore(localDate);
	}

	private LocalDate convertDate(String date, String dateFormat) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "try to convert String to date", mySession);
		DateTimeFormatter dtf = null;
		LocalDate inputDate = null;
		boolean flag;
		try {
			dtf = DateTimeFormatter.ofPattern(dateFormat);
			inputDate = LocalDate.parse(date, dtf);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "User Entered Valid Date format", mySession);
			return localDate;
		} catch (DateTimeParseException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DateTimeParseException Occured " + e.toString(), mySession);
		} catch (DateTimeException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DateTimeException Occured " + e.toString(), mySession);
		}
		return null;
	}

	public long getDuration(String start_date, String end_date) {
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "Duration Calculation", mySession);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		try {
			Date startDate = sdf.parse(start_date);
			Date endDate = sdf.parse(end_date);
			long difference_In_Time = endDate.getTime() - startDate.getTime();
			long difference_In_Seconds = (difference_In_Time / 1000) % 60;
			return difference_In_Seconds;
		} catch (ParseException e) {
		}
		return 0;
	}

	public java.sql.Timestamp convertSqlDate(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "ConcertSqlDate Exception Occured " + e.toString(),
					mySession);
		}
		long millis = date.getTime();
		java.sql.Timestamp ts = new Timestamp(millis);
		return ts;
	}
}
