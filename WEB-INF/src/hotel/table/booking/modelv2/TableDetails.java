package hotel.table.booking.modelv2;

public class TableDetails {
	int tableId;
	int branchId;
	int tableSize;

	public TableDetails(int tableId, int branchId, int tableSize) {
		this.tableId = tableId;
		this.branchId = branchId;
		this.tableSize = tableSize;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getTableSize() {
		return tableSize;
	}

	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}

}
