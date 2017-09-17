package bean;

/**
 * PoHeadersAllId entity. @author MyEclipse Persistence Tools
 */

public class PoHeadersAllId implements java.io.Serializable {

	// Fields

	private Integer poHeaderId;
	private Integer venderCode;

	// Constructors

	/** default constructor */
	public PoHeadersAllId() {
	}

	/** full constructor */
	public PoHeadersAllId(Integer poHeaderId, Integer venderCode) {
		this.poHeaderId = poHeaderId;
		this.venderCode = venderCode;
	}

	// Property accessors

	public Integer getPoHeaderId() {
		return this.poHeaderId;
	}

	public void setPoHeaderId(Integer poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public Integer getVenderCode() {
		return this.venderCode;
	}

	public void setVenderCode(Integer venderCode) {
		this.venderCode = venderCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PoHeadersAllId))
			return false;
		PoHeadersAllId castOther = (PoHeadersAllId) other;

		return ((this.getPoHeaderId() == castOther.getPoHeaderId()) || (this
				.getPoHeaderId() != null && castOther.getPoHeaderId() != null && this
				.getPoHeaderId().equals(castOther.getPoHeaderId())))
				&& ((this.getVenderCode() == castOther.getVenderCode()) || (this
						.getVenderCode() != null
						&& castOther.getVenderCode() != null && this
						.getVenderCode().equals(castOther.getVenderCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPoHeaderId() == null ? 0 : this.getPoHeaderId()
						.hashCode());
		result = 37
				* result
				+ (getVenderCode() == null ? 0 : this.getVenderCode()
						.hashCode());
		return result;
	}

}