package hotel.table.booking.model;

public class TableBookedDetails {
	private int bookedId;
	private BookingDetails bookingDetails;
	private TableDetails allocatedTable;
	private double tableBill;

	public TableBookedDetails(int bookedId, BookingDetails bookingDetails, TableDetails allocatedTable, double tableBill) {
		this.bookedId = bookedId;
		this.bookingDetails = bookingDetails;
		this.allocatedTable = allocatedTable;
		this.tableBill = tableBill;
	}

	public int getBookedId() {
		return bookedId;
	}

	public void setBookedId(int bookedId) {
		this.bookedId = bookedId;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public TableDetails getallocatedTable() {
		return allocatedTable;
	}

	public void setTableId(TableDetails allocatedTable) {
		this.allocatedTable = allocatedTable;
	}

	public double getTableBill() {
		return tableBill;
	}

	public void setTableBill(double tableBill) {
		this.tableBill = tableBill;
	}

}
