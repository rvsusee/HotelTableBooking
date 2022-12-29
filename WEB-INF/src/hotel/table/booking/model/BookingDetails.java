package hotel.table.booking.model;

import java.sql.Timestamp;
import java.util.Date;

public class BookingDetails {
	private int bookingId;
	private int customerId;
	private int bookingPersonCount;
	private Date bookingDateTime;
	private Timestamp bookingLog;

	public BookingDetails(int bookingId, int customerId, int bookingPersonCount, Date bookingDateTime,
			Timestamp bookingLog) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.bookingPersonCount = bookingPersonCount;
		this.bookingDateTime = bookingDateTime;
		this.bookingLog = bookingLog;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBookingPersonCount() {
		return bookingPersonCount;
	}

	public void setBookingPersonCount(int bookingPersonCount) {
		this.bookingPersonCount = bookingPersonCount;
	}

	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}

	public Timestamp getBookingLog() {
		return bookingLog;
	}

	public void setBookingLog(Timestamp bookingLog) {
		this.bookingLog = bookingLog;
	}

}
