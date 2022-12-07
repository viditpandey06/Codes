import java.util.*;

class p1 {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of array2:");
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] arr = new int[(n1+n2)];
        System.out.println("Enter the elemets of array1");
        for (int l = 0; l < a.length; l++) {
                  a[l]=sc.nextInt();            
        }
        System.out.println("Enter the elements of array2");
             for (int l = 0; l < b.length; l++) {
                b[l]=sc.nextInt();
             }
             sc.close();
        while ((i < a.length) && (j < b.length)) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i = i + 1;
            } else {
                arr[k] = b[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
        System.out.println("Output");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
