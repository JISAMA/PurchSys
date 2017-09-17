package domain;

public class planlist {
	
	private int poPlanCode;
	private int itemNum;
	private int qty;
	private int status;
	public int getPoPlanCode() {
		return poPlanCode;
	}
	public void setPoPlanCode(int poPlanCode) {
		this.poPlanCode = poPlanCode;
	}
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "planlist [poPlanCode=" + poPlanCode + ", itemNum=" + itemNum
				+ ", qty=" + qty + ", status=" + status + "]";
	}
	
	
	
	
	

}
