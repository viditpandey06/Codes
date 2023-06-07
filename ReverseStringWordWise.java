import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String newString = "";
        Stack<String> stack = new Stack<String>();
        StringTokenizer str = new StringTokenizer(input);
        while (str.hasMoreTokens()) {
            String s = str.nextToken();
            stack.push(s);
        }
        while (stack.size() != 0) {
            newString = newString + stack.pop() + " ";
        }
        return newString;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
