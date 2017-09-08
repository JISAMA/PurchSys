package bean;

import java.sql.Timestamp;

/**
 * PoHeadersAll entity. @author MyEclipse Persistence Tools
 */

public class PoHeadersAll implements java.io.Serializable {

	// Fields

	private Integer poHeaderId;
	private String poNum;
	private Integer venderCode;
	private Integer status;
	private Timestamp createTime;
	private Timestamp achieveTime;

	// Constructors

	/** default constructor */
	public PoHeadersAll() {
	}

	/** minimal constructor */
	public PoHeadersAll(String poNum, Integer venderCode, Integer status,
			Timestamp createTime) {
		this.poNum = poNum;
		this.venderCode = venderCode;
		this.status = status;
		this.createTime = createTime;
	}

	/** full constructor */
	public PoHeadersAll(String poNum, Integer venderCode, Integer status,
			Timestamp createTime, Timestamp achieveTime) {
		this.poNum = poNum;
		this.venderCode = venderCode;
		this.status = status;
		this.createTime = createTime;
		this.achieveTime = achieveTime;
	}

	// Property accessors

	public Integer getPoHeaderId() {
		return this.poHeaderId;
	}

	public void setPoHeaderId(Integer poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public String getPoNum() {
		return this.poNum;
	}

	public void setPoNum(String poNum) {
		this.poNum = poNum;
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

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getAchieveTime() {
		return this.achieveTime;
	}

	public void setAchieveTime(Timestamp achieveTime) {
		this.achieveTime = achieveTime;
	}

}