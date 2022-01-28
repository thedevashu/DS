package sorting;

public class Main {

	public static void main(String[] args) {
		//int arr[] = {-23,42,21,-54,-78,2,6,2};
		
		int  arr[]= {2, 10, 23, 55};
		//int brr[]= {2, 13, 35, 45,60,65,70};
		//int crr[] =new int[arr.length+brr.length-1];
		
		//MergSortedArray.mergArr(arr, brr, crr);
		//printarr(crr);
		//Sort.Insert(arr,false);
		//printarr(arr);
		Sort.Quick(arr,false);
		printarr(arr);
		//Sort.Insert(arr,true);
		//printarr(arr);
		//Sort.bubble(arr,false);
		//System.out.println("bubbleA");
		//printarr(arr);
		//Sort.bubble(arr,true);
		//System.out.println("bubbleD");
		//printarr(arr);
		
	}
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("<--Array");
	}
}
