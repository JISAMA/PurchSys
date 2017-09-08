package bean;

/**
 * PoSaveFrom entity. @author MyEclipse Persistence Tools
 */

public class PoSaveFrom implements java.io.Serializable {

	// Fields

	private Integer poPlanCode;
	private Integer itemNum;
	private Integer qty;
	private Integer venderCode;
	private Integer status;

	// Constructors

	/** default constructor */
	public PoSaveFrom() {
	}

	/** full constructor */
	public PoSaveFrom(Integer poPlanCode, Integer itemNum, Integer qty,
			Integer venderCode, Integer status) {
		this.poPlanCode = poPlanCode;
		this.itemNum = itemNum;
		this.qty = qty;
		this.venderCode = venderCode;
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

	public Integer getVenderCode() {
		return this.venderCode;
	}

	public void setVenderCode(Integer venderCode) {
		this.venderCode = venderCode;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}