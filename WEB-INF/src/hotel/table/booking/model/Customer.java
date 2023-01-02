package hotel.table.booking.model;

public class Customer {
	private int id;
	private String name;
	private int mobileNumber;
	private String emailId;

	public Customer(int id, String name, int mobileNumber, String emailId) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
