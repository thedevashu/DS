package sorting;
/* Merge arr, brr to create SORTED crr
 arr=[2, 10, 23, 55]     brr=[2, 13, 35, 45]
 
 crr = [2, 7, 10, 13, 23, 35, 45, 55]*/
public class MergSortedArray {
	public static void mergArr(int arr[], int brr[],int crr[]) {
		int ai ,bi,ci;
		ai =bi =ci =0;
		while(ai<arr.length && bi<brr.length) {
			if(arr[ai] <brr[bi]) {
				crr[ci] = arr[ai];
				ai++;
//				bi++;
				ci++;
			}
			else if(arr[ai] >brr[bi]) {
				crr[ci] = brr[bi];
				bi++;
				ci++;
			}
			else {
			crr[ci] =arr[ai];
			ci++;
			ai++;
			bi++;
			
			}
			
		}
		while(ai<arr.length) {
			
			{
				crr[ci] = arr[ai];
				ai++;
//				bi++;
				ci++;
			}
		}
		
		while (bi<brr.length) {
			 {
				crr[ci] = brr[bi];
				bi++;
				ci++;
			}
		}
	}
}
