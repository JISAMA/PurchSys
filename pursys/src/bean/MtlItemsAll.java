package bean;

/**
 * MtlItemsAll entity. @author MyEclipse Persistence Tools
 */

public class MtlItemsAll implements java.io.Serializable {

	// Fields

	private Integer itemNum;
	private String itemName;
	private String itemDescription;
	private String itemType;

	// Constructors

	/** default constructor */
	public MtlItemsAll() {
	}

	/** minimal constructor */
	public MtlItemsAll(String itemName, String itemType) {
		this.itemName = itemName;
		this.itemType = itemType;
	}

	/** full constructor */
	public MtlItemsAll(String itemName, String itemDescription, String itemType) {
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemType = itemType;
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

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}