package bean;

/**
 * PoSaveFrom entity. @author MyEclipse Persistence Tools
 */

public class PoSaveFrom implements java.io.Serializable {

	// Fields

	private Integer poPlanCode;
	private Integer itemNum;
	private Integer qty;
	private Integer status;

	// Constructors

	/** default constructor */
	public PoSaveFrom() {
	}

	/** full constructor */
	public PoSaveFrom(Integer itemNum, Integer qty, Integer status) {
		this.itemNum = itemNum;
		this.qty = qty;
		this.status = status;
	}

	// Property accessors

	public Integer getPoPlanCode() {
		return this.poPlanCode;
	}

	public void setPoPlanCode(Integer poPlanCode) {
		this.poPlanCode = poPlanCode;
	}

	public Integer getItemNum() {
		return this.itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}