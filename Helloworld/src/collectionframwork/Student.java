package collectionframwork;

public class Student {
	private int id ;
	private String StudentName;
	private int std;
	

	public Student(int id, String studentName, int std) {
		this.id = id;
		StudentName = studentName;
		this.std = std;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", std=" + std + "]";
	}
	
	

}
