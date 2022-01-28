
public class ClassQueue {
	int arr[];
	int F=-1;
	int R =-1;
	ClassQueue(int size){
		arr =new int[size];
		F=R=-1;
	}
	

	public void insert(int num) {
		
		if(R<arr.length-1) {
			if(F==-1)
				F=0;
			R++;
			arr[R]=num;
		}
		else
			System.out.println("Queue is full element not added"); 
	}

	public int delet() {
		
		if(F==-1) {
			System.out.println("Queue is empty");
			return 0;
		}
		int temp =arr[F];
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
		//this.arr = q1.arr;
		this.F = q1.F;
		this.R =q1.R;
		
		for(int i =F;i<=R;i++) {
			this.arr[i] = q1.arr[i];
		}
		
	}
	
	public ClassQueue concat(ClassQueue c1,ClassQueue c2) {
		
		int i,j;
		this.F=this.R=0;
		
		
		for(i=c1.F;i<=c1.R;i++) {
			this.arr[this.R++] =c1.arr[i];
		}
		for(j=c2.F;j<c2.R;j++) {
			this.arr[this.R++] =c2.arr[j];
		}
		this.R--;
		
		
		return this;
		
	}
}
