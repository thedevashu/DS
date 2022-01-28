
public class EmployeeQueue {
	Employee []arr;
	int F;
	int R;
	
	EmployeeQueue(int size){
		arr =new Employee[size];
		F=R=-1;
	}
	
	public void insertEmp(Employee e) {
		if(R<arr.length-1) {
			if(F==-1) 	F=0;
				
			R++;
			arr[R] =e;
				
		}
		else System.out.println("Queue is empty");
	}
	
	public Employee deletEmp() {
		if(F==-1) {
			System.out.println("Queue is empty");
			return null;
		}
		 
			Employee temp =arr[F];
			if(F==R) {
				F=R=-1;
				return null;
			}
			else {
			F++;
			return temp;
			}
			
		
	}
	
	public String toString() {
		String str ="";
		if(F==-1) {
			return str ="Queue is empty";
		}
		else {
		for(int i=F;i<=R;i++) {
			str+=arr[i]+ " ";
		}
		return str;
		}
	}
	
}
