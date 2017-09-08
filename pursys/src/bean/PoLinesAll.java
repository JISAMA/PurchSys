package bean;

/**
 * PoLinesAll entity. @author MyEclipse Persistence Tools
 */

public class PoLinesAll implements java.io.Serializable {

	// Fields

	private Integer poLineId;
	private Integer poHeaderId;
	private String lineNum;
	private Integer itemCode;
	private Integer qty;
	private Integer receivedQty;
	private Integer price;

	// Constructors

	/** default constructor */
	public PoLinesAll() {
	}

	/** minimal constructor */
	public PoLinesAll(Integer poHeaderId, String lineNum, Integer itemCode,
			Integer qty, Integer receivedQty) {
		this.poHeaderId = poHeaderId;
		this.lineNum = lineNum;
		this.itemCode = itemCode;
		this.qty = qty;
		this.receivedQty = receivedQty;
	}

	/** full constructor */
	public PoLinesAll(Integer poHeaderId, String lineNum, Integer itemCode,
			Integer qty, Integer receivedQty, Integer price) {
		this.poHeaderId = poHeaderId;
		this.lineNum = lineNum;
		this.itemCode = itemCode;
		this.qty = qty;
		this.receivedQty = receivedQty;
		this.price = price;
	}

	// Property accessors

	public Integer getPoLineId() {
		return this.poLineId;
	}

	public void setPoLineId(Integer poLineId) {
		this.poLineId = poLineId;
	}

	public Integer getPoHeaderId() {
		return this.poHeaderId;
	}

	public void setPoHeaderId(Integer poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public String getLineNum() {
		return this.lineNum;
	}

	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}

	public Integer getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getReceivedQty() {
		return this.receivedQty;
	}

	public void setReceivedQty(Integer receivedQty) {
		this.receivedQty = receivedQty;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}