package bean;

/**
 * HrPerson entity. @author MyEclipse Persistence Tools
 */

public class HrPerson implements java.io.Serializable {

	// Fields

	private String empNum;
	private String name;
	private String managerEmpNum;
	private String job;
	private String department;

	// Constructors

	/** default constructor */
	public HrPerson() {
	}

	/** minimal constructor */
	public HrPerson(String empNum, String name, String job, String department) {
		this.empNum = empNum;
		this.name = name;
		this.job = job;
		this.department = department;
	}

	/** full constructor */
	public HrPerson(String empNum, String name, String managerEmpNum,
			String job, String department) {
		this.empNum = empNum;
		this.name = name;
		this.managerEmpNum = managerEmpNum;
		this.job = job;
		this.department = department;
	}

	// Property accessors

	public String getEmpNum() {
		return this.empNum;
	}

	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerEmpNum() {
		return this.managerEmpNum;
	}

	public void setManagerEmpNum(String managerEmpNum) {
		this.managerEmpNum = managerEmpNum;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}