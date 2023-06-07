import java.util.* ;
import java.util.StringTokenizer;

import java.io.*; 
public class Solution {
	public static String encode(String message) {
		//System.out.println(message);
		String ans="";int ctr=0;
		for (char ch='a';ch<='z';ch++) {
		  int len= message.length(),i=0;
		 ctr=0;
		  while(len>0)
		  {  
			  if(message.charAt(i++)==ch){
				  ctr++;
			  }
			  len--;
			

		  }
		    if(ctr>0)
			  {
				  ans=ans+ch+ctr;
			  }
		}
		return ans;
	}
}
