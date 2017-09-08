package domain;

public class Person {
	private String empNum;
	private String name;
	private String managerEmpNum;
	private String job;
	private String department;
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManagerEmpNum() {
		return managerEmpNum;
	}
	public void setManagerEmpNum(String managerEmpNum) {
		this.managerEmpNum = managerEmpNum;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Person [empNum=" + empNum + ", name=" + name
				+ ", managerEmpNum=" + managerEmpNum + ", job=" + job
				+ ", department=" + department + "]";
	}
	
	
	
	

}
