import java.util.*;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);     
     String s;
     s= sc.nextLine();
     sc.close();
     int len =s.length();
     char tempArray[] = s.toCharArray();
     Arrays.sort(tempArray);
     char ch = tempArray[len-1];
     
      for( char start='a';start<=ch;start++ ){
        int ctr=0;
        for(int i=0;i<len;i++){
            if(start==tempArray[i])
            {
                ctr++;
            }

        }
                    System.out.println(ctr + "" + start);
      }
 
    }
}
