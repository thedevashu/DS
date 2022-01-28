


public class Student {
	private int rollNo;
	private String studentName;
	private boolean isExperianced;
	
	Student(int rollNo,String studentName,boolean isExperianced){
		this.setRollNo(rollNo);
		this.setStudentName(studentName);
		this.setExperianced(isExperianced);
	}
	
	public String toString() {
		String str ="Roll no:" + rollNo +"Name: "+ studentName+"Experienced: " + isExperianced;
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

	public boolean isExperianced() {
		return isExperianced;
	}

	public void setExperianced(boolean isExperianced) {
		this.isExperianced = isExperianced;
	}
}
