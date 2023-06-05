import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int prev;
			 PriorityQueue<Integer> maxheap= new PriorityQueue<Integer>();
             for(int i=0;i<n;i++)
			 {
				 maxheap.add(-arr[i]);
			 }
			 prev=maxheap.peek();
			 maxheap.remove(prev);
             
			 while(maxheap.size()!=0)
			 {
				 int curr=maxheap.peek();
				 if(curr!=prev)
				 {
					 return -curr;
				 }
				 else
				{   
					prev=curr;
					maxheap.remove(curr);
				}
			 }
			 return-1;

	}
}
