import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int leftsum=0,rightsum=0,ptr=0;
		for(ptr=0;ptr<arr.length;ptr++){
			leftsum=arr[ptr]+leftsum;
		}
		if(leftsum==0||arr.length==1){
			return 0;
		}
		for(ptr=0;ptr<arr.length;ptr=ptr+1)
		{
			if(ptr==0)
			{
			    leftsum=leftsum-arr[ptr];
			}
			else
			{
			rightsum=arr[ptr-1]+rightsum;
			leftsum=leftsum-arr[ptr];
			}

			if(leftsum==rightsum)
			{
				return ptr;
			}
		}
		return -1;
	}
}
