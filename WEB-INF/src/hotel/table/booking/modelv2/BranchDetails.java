package hotel.table.booking.modelv2;

import java.util.ArrayList;

public class BranchDetails {
	private int branchID;
	private int branchName;
	private int branchAddress;
	ArrayList<TableDetails> tableDetails = new ArrayList<TableDetails>();
	
	public BranchDetails(int branchID, int branchName, int branchAddress, ArrayList<TableDetails> tableDetails) {
		this.branchID = branchID;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.tableDetails = tableDetails;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public int getBranchName() {
		return branchName;
	}
	public void setBranchName(int branchName) {
		this.branchName = branchName;
	}
	public int getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(int branchAddress) {
		this.branchAddress = branchAddress;
	}
	public ArrayList<TableDetails> getTableDetails() {
		return tableDetails;
	}
	public void setTableDetails(ArrayList<TableDetails> tableDetails) {
		this.tableDetails = tableDetails;
	}
	@Override
	public String toString() {
		return "BranchDetails [branchID=" + branchID + ", branchName=" + branchName + ", branchAddress=" + branchAddress
				+ ", tableDetails=" + tableDetails + "]";
	}
	
	
}
