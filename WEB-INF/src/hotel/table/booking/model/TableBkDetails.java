package hotel.table.booking.model;

public class TableBkDetails {
	private int tk;
	private int tbID;
	private int bkID;
	private int tbkDuration;
	private int tbBill;

	public TableBkDetails(int tbk, int tbID, int bkID, int tbkDuration, int tbBill) {
		this.tbk = tbk;
		this.tbID = tbID;
		this.bkID = bkID;
		this.tbkDuration = tbkDuration;
		this.tbBill = tbBill;
	}

	public int getTbk() {
		return tbk;
	}

	public void setTbk(int tbk) {
		this.tbk = tbk;
	}

	public int getTbID() {
		return tbID;
	}

	public void setTbID(int tbID) {
		this.tbID = tbID;
	}

	public int getBkID() {
		return bkID;
	}

	public void setBkID(int bkID) {
		this.bkID = bkID;
	}

	public int gettbkDuration() {
		return tbkDuration;
	}

	public void settbkDuration(int tbkDuration) {
		this.tbkDuration = tbkDuration;
	}

	public int getTbBill() {
		return tbBill;
	}

	public void setTbBill(int tbBill) {
		this.tbBill = tbBill;
	}

	@Override
	public String toString() {
		return "TableBkDetails [tbk=" + tbk + ", tbID=" + tbID + ", bkID=" + bkID + ", tbkDuration=" + tbkDuration
				+ ", tbBill=" + tbBill + "]";
	}

}
