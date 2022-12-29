package hotel.table.booking.model;

import java.util.ArrayList;

public class BranchDetails {
	private int branchId;
	private String branchName;
	private String branchAddress;
	ArrayList<TableDetails> tableDetails = new ArrayList<TableDetails>();
	
	public BranchDetails(int branchId, String branchName, String branchAddress, ArrayList<TableDetails> tableDetails) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.tableDetails = tableDetails;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public ArrayList<TableDetails> getTableDetails() {
		return tableDetails;
	}
	public void setTableDetails(ArrayList<TableDetails> tableDetails) {
		this.tableDetails = tableDetails;
	}
	
	
	
}
