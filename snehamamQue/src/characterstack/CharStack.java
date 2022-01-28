/*no. of vowels in char stack */

package characterstack;

public class CharStack {
	char arr[];
	int F,R;

	CharStack(int size){
		arr =new char[size];
		F=R=-1;
	}

	public void insert(char ch) {
		if((F==0) && (R==arr.length-1)) {
			System.out.println("Stack is full");
		}
		else {
			R++;
			arr[R] =ch;

			if(F==-1) {
				F=0;
			}
		}
	}

	public char delet() {
		char val ='\0';
		if(F==-1) {
			System.out.println("Stack in empty");
		}

		else {
			if(F==R) {
				F=R=-1;
			}
			else {
				val =arr[F];
				F++;
			}

		}
		return val;
	}

	public void vowels(CharStack c) {
		int count =0;
		for(int i=this.F;i<this.R;i++) {
			if((arr[i] == 'a') ||(arr[i] == 'A') || (arr[i] == 'e') ||(arr[i] == 'E')||(arr[i] == 'i') ||(arr[i] == 'I')||(arr[i] == 'O') ||(arr[i] == 'o')||(arr[i] == 'u') ||(arr[i] == 'U')) {
				count++;
			}
		}
		System.out.println("no. of vowel -"+count);
	}

	public String toString() {
		String str ="";
		int i;
		if(F == -1) {
			str ="stack is empty";
		}
		else {
			for(i =F;i<=R;i++) {
			}
			str+=arr[i];
		}

		return   str ;

	}

}
