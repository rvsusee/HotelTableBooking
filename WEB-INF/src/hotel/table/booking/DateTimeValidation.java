package hotel.table.booking;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
//		-1	-> Wrong
//		-2	-> wrong date Format
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
			return -2;
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
			return inputDate;
		} catch (DateTimeParseException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DateTimeParseException Occured " + e.toString(), mySession);
		} catch (DateTimeException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, "DateTimeException Occured " + e.toString(), mySession);
		}
		return null;
	}
}
