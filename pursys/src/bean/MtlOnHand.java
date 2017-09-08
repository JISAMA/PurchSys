package bean;

/**
 * MtlOnHand entity. @author MyEclipse Persistence Tools
 */

public class MtlOnHand implements java.io.Serializable {

	// Fields

	private Integer itemNum;
	private String itemName;
	private Integer qty;

	// Constructors

	/** default constructor */
	public MtlOnHand() {
	}

	/** full constructor */
	public MtlOnHand(String itemName, Integer qty) {
		this.itemName = itemName;
		this.qty = qty;
	}

	// Property accessors

	public Integer getItemNum() {
		return this.itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}