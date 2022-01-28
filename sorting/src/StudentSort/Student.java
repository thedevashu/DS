package StudentSort;



public class Student {
	private int rollNo;
	private String studentName;
	
	Student(int rollNo,String studentName){
		this.setRollNo(rollNo);
		this.setStudentName(studentName);
		
	}
	
	public String toString() {
		String str ="Roll no:" + rollNo +"Name: "+ studentName;
		return str;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
