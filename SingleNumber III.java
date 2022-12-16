class Solution {
    public int[] singleNumber(int[] nums) {
      int res=0;
      int temp=0,j=0;
      int [] ans= new int[2];
      for(int i=0;i<nums.length;i++){
          res=res^nums[i];
      }   
          //System.out.print(res);
          temp= res;
         int bitmask=1;
         for(int i=0;i<=10;i++)
         {
               if((bitmask&res)!=0){
                    j=i;
                     break;
               }
                 bitmask=bitmask<<i;
       
          }
          int sum1=0;
        int sum2=0;
        System.out.println(j);
       
        for (int i = 0; i < nums.length; i++) {
 
            if ((nums[i] & bitmask ) ==0) {
                sum1 = (sum1 ^ nums[i]);
            }
            else {
                sum2 = (sum2 ^ nums[i]);
            }
        }
                ans[0]=sum1;
                ans[1]=sum2; 
                return ans;

  
     }
}
