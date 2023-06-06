import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		int ctr=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]<=arr[i+1])
			{

				continue;
			}
			else{
				ctr+=1;
			}
		}
		if(ctr==1||ctr==0)
		{
			return true;
		}
		 else{
		 	return false;
		 }
		
	}
}
