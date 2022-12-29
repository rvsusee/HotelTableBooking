package hotel.table.booking.modelv2;

public class UserDetails {

	private int userId;
	private String userName;
	private int userMobileNo;
	private String userEmailId;

	public UserDetails(int userId, String userName, int userMobileNo, String userEmailId) {
		this.userId = userId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.userEmailId = userEmailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(int userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

}
