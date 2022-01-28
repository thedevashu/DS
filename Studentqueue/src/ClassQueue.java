
public class ClassQueue {
	Student arr[];
	int F=-1;
	int R =-1;
	ClassQueue(int size){
		arr =new Student[size];
		F=R=-1;
	}
	public void firstClass() {
		Student std[] =new Student[arr.length];
		for(int i =F;i<=R;i++) {
			if(arr[i].getMark()>74f) {

				System.out.println(arr[i]);
			}
		}
		

	}

	public void insert(Student s) {

		if(R<arr.length-1) {
			if(F==-1)
				F=0;
			R++;
			arr[R]=s;
		}
		else
			System.out.println("Queue is full element not added"); 
	}

	public Student delet() {

		if(F==-1) {
			System.out.println("Queue is empty");
			return null;
		}
		Student temp =arr[F];
		if(F==R) {
			F=R=-1;
		}
		else
			F++;
		return temp;

		//		if(R==F) {
		//			F=R=-1;
		//			return 0;
		//		}
		//		int temp=arr[F];
		//		F++;
		//		return temp;
	}

	public String toString() {
		String str ="";
		if(F==-1) {
			str ="queue is empty";
			return str;
		}
		else {

			for (int i = F; i <= R; i++){
				str+= arr[i]+",";
			}
			return str;
		}


		//return str;
	}
	public void sameAs(ClassQueue q1) {
		this.arr = q1.arr;
		this.F = q1.F;
		this.R =q1.R;

	}
}
