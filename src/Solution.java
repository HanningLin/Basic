import java.util.Stack;

public class Solution {
        public static int basicCalculator (String s) {
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            int sign = 1;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    int num = s.charAt(i) - '0';
                    while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                        num = num * 10 + s.charAt(i + 1) - '0';
                        i++;
                    }
                    res += num * sign;
                } else if (s.charAt(i) == '+') {
                    sign = 1;
                } else if (s.charAt(i) == '-') {
                    sign = -1;
                } else if (s.charAt(i) == '(') {
                    stack.push(res);
                    stack.push(sign);
                    res = 0;
                    sign = 1;
                } else if (s.charAt(i) == ')') {
                    res = res * stack.pop() + stack.pop();
                }
            }
            return res;
    }
    public static void main(String[] args) {
        String s = "a//b";
        String[] ss = s.split("/+");
        StringBuilder s1 = new StringBuilder("a//b");
        s1.reverse().toString();

        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);

        }
    }
}
