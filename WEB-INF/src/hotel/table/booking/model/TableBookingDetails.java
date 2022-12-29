package hotel.table.booking.model;

public class TableBookingDetails {
	private int tbkID;
	private int bkID;
	private int userID;

	public TableBookingDetails(int tbkID, int bkID, int userID) {
		super();
		this.tbkID = tbkID;
		this.bkID = bkID;
		this.userID = userID;
	}

	public int getTbkID() {
		return tbkID;
	}

	public void setTbkID(int tbkID) {
		this.tbkID = tbkID;
	}

	public int getBkID() {
		return bkID;
	}

	public void setBkID(int bkID) {
		this.bkID = bkID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "TableBookingDetails [tbkID=" + tbkID + ", bkID=" + bkID + ", userID=" + userID + "]";
	}

}
