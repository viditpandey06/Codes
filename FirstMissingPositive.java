import java.util.* ;

import java.io.*; 

public class Solution {

    public static int firstMissing(int[] arr, int n) {

        // Write your code here.    

        int leastNum =1;

        Arrays.sort(arr);

        

        for(int i=0;i<n;i++){

         if(leastNum<arr[i]){

             return leastNum;

         }

         if(arr[i]>0){

               leastNum++;

         }

         else{

             continue;

         }

}

        return leastNum;    

    }

}

