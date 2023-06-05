import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		int size=0,val=0,i=0,temp=0,loop=0;
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
        size=scanner.nextInt();
		loop=size;
		while (loop!=0) {
			val=scanner.nextInt();
            arrayList.add(val);
			loop--;

		}
		val=0;
		val=scanner.nextInt();
		 
			while (val!=0) {
				//System.out.println(arrayList);
				temp=arrayList.get(0);
				arrayList.remove(0);
				arrayList.add(temp);
				val=val-1;
			}
			
	
		int [] arr = new int [size];
           for (int j = 0; j < arr.length; j++) {
			   arr[j]=arrayList.get(j);
		   }
		for (int j = 0; j < arr.length; j++) {
			   System.out.print(arr[j]+" ");
		   }
	}
}
