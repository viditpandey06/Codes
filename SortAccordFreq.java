import java.util.*;
public class SortAccordFreq {
    public static void main(String[] args) {
        System.out.println("Enter the string here");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int len =str.length();
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        char ch = tempArray[len-1];
        List <Integer> list= new ArrayList<Integer>();
        for (char start = 'a'; start <= ch; start++ ){
        int ctr=0;
        
        for (int i = 0; i < len; i++) {
            if(start==tempArray[i])
            {
                ctr++;
            }
            

        }
         list.add(ctr);  
    }
    Collections.sort(list);
    //Collections.SortAccordFreq(list);
System.out.println(list);
    }

}
