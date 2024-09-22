package tasks;

import java.util.Arrays;

public class LinearSearch {

	static int search(int[]a,int target) {
		
		if(a.length==0) {
			return -1;
		}
				
		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]==target) {
				return i;	
			}
		}
          return -1;
		}
	

	public static void main(String[] args) {
				
		int[] arr= {1,8,6,2,9,1,5};
		int target=8;
		
   		int ans = search(arr, target);
   		
		System.out.println("1D Array"+ " : "+ans);//OUTPUT:1D Array : 1
		
		
		// 2D array search
        int[][] twoArr = {
            { 1, 2, 3 },
            { 8, 5, 10 },
            { 66, 4, 9 },
            { 44,88,90 }
        };
        int target2D = 5;

        int[] ans2D = search2(twoArr, target2D);
        System.out.println("2D Search Result: " + Arrays.toString(ans2D)); //OUTPUT:2D Search Result: [1, 1]

	}
	
	static int [] search2(int[][] a,int target){
		
		for(int row=0;row<a.length;row++) {
			
			for(int col=0;col<a[row].length;col++) {
				
				if(a[row][col]== target) {
					return new int [] { row, col};
				}
			}
		}
		return new int [] {-1,-1};
	}
	
}
