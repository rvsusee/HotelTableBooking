
public class BookingDetails {
	private int bookingNo;
	private int mobileNo;
	private int Persons;
	private String date;
	private String time;
	private String duration;
	private int tableNo;
	private String bkLog;

	public BookingDetails(int bookingNo, int mobileNo, int persons, String date, String time, String duration,
			String bkLog) {
		this.bookingNo = bookingNo;
		this.mobileNo = mobileNo;
		this.Persons = persons;
		this.date = date;
		this.time = time;
		this.duration = duration;
		this.bkLog = bkLog;
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPersons() {
		return Persons;
	}

	public void setPersons(int persons) {
		Persons = persons;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getBkLog() {
		return bkLog;
	}

	public void setBkLog(String bkLog) {
		this.bkLog = bkLog;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingNo=" + bookingNo + ", mobileNo=" + mobileNo + ", Persons=" + Persons + ", date="
				+ date + ", time=" + time + ", duration=" + duration + ", bkLog=" + bkLog + "]";
	}

}
