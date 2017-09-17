package bean;

import java.sql.Timestamp;

/**
 * PoHeadersAll entity. @author MyEclipse Persistence Tools
 */

public class PoHeadersAll implements java.io.Serializable {

	// Fields

	private PoHeadersAllId id;
	private String poNum;
	private Integer status;
	private Timestamp createTime;
	private Timestamp achieveTime;

	// Constructors

	/** default constructor */
	public PoHeadersAll() {
	}

	/** minimal constructor */
	public PoHeadersAll(PoHeadersAllId id, String poNum, Integer status,
			Timestamp createTime) {
		this.id = id;
		this.poNum = poNum;
		this.status = status;
		this.createTime = createTime;
	}

	/** full constructor */
	public PoHeadersAll(PoHeadersAllId id, String poNum, Integer status,
			Timestamp createTime, Timestamp achieveTime) {
		this.id = id;
		this.poNum = poNum;
		this.status = status;
		this.createTime = createTime;
		this.achieveTime = achieveTime;
	}

	// Property accessors

	public PoHeadersAllId getId() {
		return this.id;
	}

	public void setId(PoHeadersAllId id) {
		this.id = id;
	}

	public String getPoNum() {
		return this.poNum;
	}

	public void setPoNum(String poNum) {
		this.poNum = poNum;
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