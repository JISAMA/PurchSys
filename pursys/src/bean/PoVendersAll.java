package bean;

/**
 * PoVendersAll entity. @author MyEclipse Persistence Tools
 */

public class PoVendersAll implements java.io.Serializable {

	// Fields

	private Integer venderCode;
	private String venderName;
	private String address;
	private String contact;
	private String phone;

	// Constructors

	/** default constructor */
	public PoVendersAll() {
	}

	/** minimal constructor */
	public PoVendersAll(String venderName, String contact, String phone) {
		this.venderName = venderName;
		this.contact = contact;
		this.phone = phone;
	}

	/** full constructor */
	public PoVendersAll(String venderName, String address, String contact,
			String phone) {
		this.venderName = venderName;
		this.address = address;
		this.contact = contact;
		this.phone = phone;
	}

	// Property accessors

	public Integer getVenderCode() {
		return this.venderCode;
	}

	public void setVenderCode(Integer venderCode) {
		this.venderCode = venderCode;
	}

	public String getVenderName() {
		return this.venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}