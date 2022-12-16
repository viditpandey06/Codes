class SingleSum3 {
    public static void main(String [] args) {
      int res=0;
      int j=0,temp=0;
      int [] ans= new int[2];
      //Give user input here.
      int [] nums ={1193730082,587035181,-814709193,1676831308,-511259610,284593787,-2058511940,1970250135,-814709193,-1435587299,1308886332,-1435587299,1676831308,1403943960,-421534159,-528369977,-2058511940,1636287980,-1874234027,197290672,1976318504,-511259610,1308886332,336663447,1636287980,197290672,1970250135,1976318504,959128864,284593787,-528369977,-1874234027,587035181,-421534159,-786223891,933046536,959112204,336663447,933046536,959112204,1193730082,-786223891};
      for(int i=0;i<nums.length;i++){
                temp=(int)Math.abs(nums[i]);
        res=res^temp;
      }   
          //System.out.print(res);
          //temp= res;
         int bitmask=1;
         for(int i=1;i<=10;i++)
         {
               if((bitmask&res)!=0){
                    j=i;
                     break;
               }
                 bitmask=bitmask<<i;
       
          }
          int sum1=0;
        int sum2=0;
          
       
        for (int i = 0; i < nums.length; i++) {
                  temp = (int) Math.abs(nums[i]);
            if ((temp & bitmask ) ==0) {
                sum1 = (sum1 ^ temp);
            }
            else {
                sum2 = (sum2 ^ temp);
            }
        }
                ans[0]=sum1;
                ans[1]=sum2; 
                for (int i = 0; i < 2; i++) { 
                    System.out.println(ans[i]);
                    
                }

           
     }
}