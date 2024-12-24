package Barath.com.Zoho.SecondRound;

import java.util.Scanner;
import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else {
                if (stack.pop() != c || stack.isEmpty()) return false;
            }
        }
        return true;
    }
}
