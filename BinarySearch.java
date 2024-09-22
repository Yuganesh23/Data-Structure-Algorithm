package tasks;

public class BinarySearch {

	static int search (int[]ar, int target) {
		
		int start = 0;
		int end =ar.length-1;
		
		boolean asc=ar[start]<ar[end];
		
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if (ar[mid]== target) {
				return mid;
			}
		
			if (asc) {
				if(target <ar[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				
				if (target>ar[mid]) {
					start=mid+1;
				}
//				else {
// 					end =mid-1;
//
//				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {

	    int [] arr1 = {20,19,1,17,15,10,9,8,7,6,5};
		int [] arr2= {1,5,8,9,10,11,55};
		int target=10;
	
	 System.out.println("Index in descending array: " + search(arr1, target));
	 System.out.println("Index in ascending array: " + search(arr2, target));
		
	}
}

//Index in descending array: 5
//Index in ascending array: 4




