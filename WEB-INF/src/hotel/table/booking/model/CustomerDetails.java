package hotel.table.booking.model;

public class CustomerDetails {
	private int customerId;
	private String customerName;
	private int customerMobileNo;
	private String customerEmailId;

	public CustomerDetails(int customerId, String customerName, int customerMobileNo, String customerEmailId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNo = customerMobileNo;
		this.customerEmailId = customerEmailId;
	}

	public int getcustomerId() {
		return customerId;
	}

	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getcustomerMobileNo() {
		return customerMobileNo;
	}

	public void setcustomerMobileNo(int customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getcustomerEmailId() {
		return customerEmailId;
	}

	public void setcustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

}
