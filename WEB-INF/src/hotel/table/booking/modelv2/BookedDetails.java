package hotel.table.booking.modelv2;

public class BookedDetails {
	int BookedDetailsID;
	int BookedDetailsPersonCount;
	int BookedDetailsDate;
	int BookedDetailsTime;
	int BookedDetailsLog;

	public BookedDetails(int BookedDetailsID, int BookedDetailsPersonCount, int BookedDetailsDate, int BookedDetailsTime, int BookedDetailsLog) {
		this.BookedDetailsID = BookedDetailsID;
		this.BookedDetailsPersonCount = BookedDetailsPersonCount;
		this.BookedDetailsDate = BookedDetailsDate;
		this.BookedDetailsTime = BookedDetailsTime;
		this.BookedDetailsLog = BookedDetailsLog;
	}

	public int getBookedDetailsID() {
		return BookedDetailsID;
	}

	public void setBookedDetailsID(int BookedDetailsID) {
		this.BookedDetailsID = BookedDetailsID;
	}

	public int getBookedDetailsPersonCount() {
		return BookedDetailsPersonCount;
	}

	public void setBookedDetailsPersonCount(int BookedDetailsPersonCount) {
		this.BookedDetailsPersonCount = BookedDetailsPersonCount;
	}

	public int getBookedDetailsDate() {
		return BookedDetailsDate;
	}

	public void setBookedDetailsDate(int BookedDetailsDate) {
		this.BookedDetailsDate = BookedDetailsDate;
	}

	public int getBookedDetailsTime() {
		return BookedDetailsTime;
	}

	public void setBookedDetailsTime(int BookedDetailsTime) {
		this.BookedDetailsTime = BookedDetailsTime;
	}

	public int getBookedDetailsLog() {
		return BookedDetailsLog;
	}

	public void setBookedDetailsLog(int BookedDetailsLog) {
		this.BookedDetailsLog = BookedDetailsLog;
	}

	@Override
	public String toString() {
		return "BookedDetails [BookedDetailsID=" + BookedDetailsID + ", BookedDetailsPersonCount=" + BookedDetailsPersonCount + ", BookedDetailsDate=" + BookedDetailsDate + ", BookedDetailsTime="
				+ BookedDetailsTime + ", BookedDetailsLog=" + BookedDetailsLog + "]";
	}

}
