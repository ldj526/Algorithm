import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char ch : input.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) cnt++;
        }

        System.out.print(cnt);
    }
}