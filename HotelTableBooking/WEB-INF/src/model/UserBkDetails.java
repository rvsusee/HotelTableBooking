package model;

public class UserBkDetails {
	private int bkID;
	private int userID;
	private int bkPersonCount;
	private String bkDate;
	private String bkTime;
	private int bkDuration;
	private int tbNo;

	public UserBkDetails(int bkID, int userID, int bkPersonCount, String bkDate, String bkTime, int bkDuration,
			int tbNo) {
		this.bkID = bkID;
		this.userID = userID;
		this.bkPersonCount = bkPersonCount;
		this.bkDate = bkDate;
		this.bkTime = bkTime;
		this.bkDuration = bkDuration;
		this.tbNo = tbNo;
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

	public int getBkPersonCount() {
		return bkPersonCount;
	}

	public void setBkPersonCount(int bkPersonCount) {
		this.bkPersonCount = bkPersonCount;
	}

	public String getBkDate() {
		return bkDate;
	}

	public void setBkDate(String bkDate) {
		this.bkDate = bkDate;
	}

	public String getBkTime() {
		return bkTime;
	}

	public void setBkTime(String bkTime) {
		this.bkTime = bkTime;
	}

	public int getBkDuration() {
		return bkDuration;
	}

	public void setBkDuration(int bkDuration) {
		this.bkDuration = bkDuration;
	}

	public int gettbNo() {
		return tbNo;
	}

	public void settbNo(int tbNo) {
		this.tbNo = tbNo;
	}
}
