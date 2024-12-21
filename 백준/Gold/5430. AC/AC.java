import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();

            Deque<Integer> dq = new ArrayDeque<>();
            if (n > 0) {
                arr = arr.substring(1, arr.length() - 1);
                String[] elements = arr.split(",");
                for (String element : elements) {
                    dq.add(Integer.parseInt(element));
                }
            }

            boolean isReversed = false;
            boolean error = false;

            for (char command: commands.toCharArray()) {
                if (command == 'R') {
                    isReversed = !isReversed;
                } else if (command == 'D') {
                    if (dq.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (isReversed) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                }
            }

            if (error) {
                sb.append("error\n");
            } else {
                sb.append("[");
                while (!dq.isEmpty()) {
                    sb.append(isReversed ? dq.pollLast() : dq.pollFirst());
                    if (!dq.isEmpty()) {
                        sb.append(',');
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb);
    }
}