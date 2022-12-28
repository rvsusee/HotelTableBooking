package model;

import java.util.ArrayList;

public class User {
	private int userID;
	private String userName;
	private int mobileNo;
	private String emailID;
	ArrayList<UserBkDetails> bkDetails = new ArrayList<UserBkDetails>();

	public User(int userID, String userName, int mobileNo, String emailID) {
		this.userID = userID;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
