/*
- Have a common function for ascending/descending
- Move logical sorting functions into the Sort class
- Implement Quick Sort function

-
*/

package sorting;

public class Sort {

	public static void bubble(int arr[],boolean des) {
		int i,j,scheck = 0,temp;
		for( i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				scheck =0;
				if(des == false)
				{
					if(arr[j+1]<arr[j]) {
						temp =arr[j+1];
						arr[j+1] = arr[j];
						arr[j] =temp;
						scheck++;
					}	
				}
				else {

					if(arr[j+1]>arr[j]) {
						temp =arr[j+1];
						arr[j+1] = arr[j];
						arr[j] =temp;
						scheck++;
					}

				}
			}
			if(scheck == 0)	break;
		}		
	}

	public static void Insert(int arr[],boolean des) {
		int i,k;
		int temp;
		for(i=1;i<arr.length;i++) {
			temp =arr[i];
			k=i-1;
			while(k>=0) {
				if(des==false) {
					if(temp<arr[k]) {
						arr[k+1] =arr[k];
					}
					else
						break;
					k--;
					arr[k+1]=temp;
				}
				
				else {
					if(temp>arr[k]) {
						arr[k+1] =arr[k];
					}
					else
						break;
					k--;
					arr[k+1]=temp;
				}
				}
			}

		}

	public static void Selection(int arr[],boolean des) {
		int i,j;
		int temp;
		for(i=0;i<arr.length-1;i++) {
			temp =arr[i];
			for(j=i;j<arr.length;j++) {
				if(des == false) {
					if(temp>arr[j]) {
						int swap =arr[j];
						arr[j]=temp;
						temp =swap;

					}
					else {
						if(temp<arr[j]) {
							int swap =arr[j];
							arr[j]=temp;
							temp =swap;

						}
					}
				}
				arr[i] =temp;
			}
		}
	}

	//-------------Quick_Sort------------------
	public static void Quick(int arr[], boolean b) {
		
		
		quicksort(arr,0,arr.length-1,b);
	}

	private static void quicksort(int[] arr, int l, int h ,boolean b) {
		if(l<=h) {
			int partloc =partision(arr,l,h,b);//catching partition location
			
			quicksort(arr,partloc+1,h,b);	//for right array
			
			quicksort(arr,l,partloc -1,b);	//for left arry
			
		}
		
	}

	private static int partision(int arr[], int l, int h,boolean b) {
		// TODO Auto-generated method stub
		int j=l;
		int i =j-1;
		
		while(j<=h) {
			if(b == true) {
			if(arr[h]<arr[j]) {
				i++;
				int temp =arr[i];
				arr[i] =arr[j];
				arr[j] =temp;
			}
			j++;
		}
			else {
				if(arr[h]>arr[j]) {
					i++;
					int temp =arr[i];
					arr[i] =arr[j];
					arr[j] =temp;
				}
				j++;
			}
			
		}
		i++;
		int temp =arr[i];
		arr[i]=arr[h];
		arr[h] =temp;
		
		return i;
		
	} 
	//-------------Quick_Sort------------------	
	
}
