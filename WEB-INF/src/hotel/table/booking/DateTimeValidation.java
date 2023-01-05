package hotel.table.booking;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeValidation {

	public int dateValidation(String date, String dateFormat) {
//		3	-> Future
//		2	-> Today
//		1	-> Past
//		-1	-> Wrong
		if (isDateFuture(date, dateFormat))
			return 3;
		else if (isDateToday(date, dateFormat))
			return 2;
		else if (isDatePast(date, dateFormat)) {
			return 1;
		} else {
			return -1;
		}
	}

	private boolean isDateFuture(final String date, final String dateFormat) {
		LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDate inputDate = LocalDate.parse(date, dtf);
		return inputDate.isAfter(localDate);
	}

	private boolean isDateToday(final String date, final String dateFormat) {
		LocalDate localDate = LocalDate.now(ZoneId.systemDefault());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDate inputDate = LocalDate.parse(date, dtf);

		return inputDate.isEqual(localDate);
	}

	private boolean isDatePast(final String date, final String dateFormat) {
		LocalDate localDate = LocalDate.now(ZoneId.systemDefault());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDate inputDate = LocalDate.parse(date, dtf);

		return inputDate.isBefore(localDate);
	}
}
