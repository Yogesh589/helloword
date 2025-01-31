package collectionframwork;

public class Employee {
	private int empId;
	private String empName;
	private double empSalaray;
	
	public Employee(int empId, String empName, double empSalaray) {
		this.empId = empId;
		this.empName = empName;
		this.empSalaray = empSalaray;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalaray() {
		return empSalaray;
	}

	public void setEmpSalaray(double empSalaray) {
		this.empSalaray = empSalaray;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalaray=" + empSalaray + "]";
	}
	
	
	

}
