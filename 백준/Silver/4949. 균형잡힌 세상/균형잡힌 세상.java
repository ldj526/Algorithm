import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean isBalance = true;

            if (input.equals(".")) {
                break;
            }

            for (char ch : input.toCharArray()) {
                if (ch == '(' || ch== '[') {
                    stack.push(ch);
                } else if (ch == ')'){
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isBalance = false;
                        break;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isBalance = false;
                        break;
                    }
                }
            }
            if (isBalance && stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.print(sb);
    }
}