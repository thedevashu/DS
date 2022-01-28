package hashtable;

public class StringTable {
	String [] str;
	
	public StringTable(int size) {
		str = new String[size];
	}
	
	public void insert(String strInput) {
		int key = hashFunction(strInput);
		int key_temp =key;
		if(str[key]==(null)) {
			str[key] = strInput;
		}

		else {
			while(true) {
				if(key >= str.length) {
					key =0;
				}
				key++;
				if(str[key] == null) {
					str[key] = strInput;
					break;
				}
				
			}
		}
		System.out.println("key for	"+str[key]+" was	"+key_temp +"	is at index	:" +key);
	}

	private int hashFunction(String strInput) {
		int sum =0;
		for(int i=0;i<strInput.length();i++) {
			sum +=strInput.charAt(i); 
		}
		int key = sum%str.length;
//		System.out.println("Sum :"+sum+ "Key"+key);
		return key;
	}
	
	public void search(String inputStr) {
		int key =hashFunction(inputStr);
		if(str[key].equals(inputStr)) {
			System.out.println(inputStr+"is at:"+key);
		}
		else {
			while(true) {
				key++;
				if(str[key].equals(inputStr)) {
					System.out.println(inputStr+"is at:"+key);
					break;
				}
				if(key>=str.length) {key = 0;}
			}
		}
	}
	
}
