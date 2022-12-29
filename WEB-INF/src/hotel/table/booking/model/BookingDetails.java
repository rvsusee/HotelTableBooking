
package hotel.table.booking.model;

import java.util.Date;

public class BookingDetails {
	private int bookingId;
	private Customer customer;
	private int bookingPersonCount;
	private Date bookingDateTime;
	private Date bookingOn;

	public BookingDetails(int bookingId, Customer customer, int bookingPersonCount, Date bookingDateTime,
			Date bookingOn) {
		this.bookingId = bookingId;
		this.customer = customer;
		this.bookingPersonCount = bookingPersonCount;
		this.bookingDateTime = bookingDateTime;
		this.bookingOn = bookingOn;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Customer getcustomer() {
		return customer;
	}

	public void setcustomer(Customer customer) {
		this.customer = customer;
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

	public Date getbookingOn() {
		return bookingOn;
	}

	public void setbookingOn(Date bookingOn) {
		this.bookingOn = bookingOn;
	}

}
