


public class Student {
	private int rollNo;
	private String studentName;
	private float mark;
	
	Student(int rollNo,String studentName,float mark){
		this.setRollNo(rollNo);
		this.setStudentName(studentName);
		this.setMark(mark);
	}
	
	public String toString() {
		String str ="Roll no:" + rollNo +" Name: "+ studentName+" Marks: " + mark;
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

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}
}
