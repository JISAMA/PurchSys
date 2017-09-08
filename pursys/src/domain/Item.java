package domain;

public class Item {
	private int itemNum;
	private String itemName;
	private String itemDesp;
	private String itemType;
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesp() {
		return itemDesp;
	}
	public void setItemDesp(String itemDesp) {
		this.itemDesp = itemDesp;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		return "Item [itemNum=" + itemNum + ", itemName=" + itemName
				+ ", itemDesp=" + itemDesp + ", itemType=" + itemType + "]";
	}
	
	
	

}
