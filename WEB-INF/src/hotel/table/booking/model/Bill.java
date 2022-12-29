package hotel.table.booking.model;

public class Bill {
	private int billId;
	private BookingDetails bookingDetails;
	private TableDetails allocatedTable;
	private double billAmount;

	public Bill(int billId, BookingDetails bookingDetails, TableDetails allocatedTable, double billAmount) {
		this.billId = billId;
		this.bookingDetails = bookingDetails;
		this.allocatedTable = allocatedTable;
		this.billAmount = billAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public TableDetails getAllocatedTable() {
		return allocatedTable;
	}

	public void setAllocatedTable(TableDetails allocatedTable) {
		this.allocatedTable = allocatedTable;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

}
