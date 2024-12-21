import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] heights = new long[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Long.parseLong(br.readLine());
        }

        Stack<Long> stack = new Stack<>();
        long totalCount = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                stack.pop();
            }

            totalCount += stack.size();

            stack.push(heights[i]);
        }

        System.out.print(totalCount);
    }
}