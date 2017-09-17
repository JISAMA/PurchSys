package domain;

public class Plan {
	private int itemNum;
	private int qty;
	private Integer status;
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
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Plan [itemNum=" + itemNum + ", qty=" + qty + ", status="
				+ status + "]";
	}
	
	
	

}
