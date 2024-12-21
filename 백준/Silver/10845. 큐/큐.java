import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> qe = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    qe.add(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    sb.append(qe.isEmpty() ? -1 : qe.poll()).append('\n');
                    break;
                case "size":
                    sb.append(qe.size()).append('\n');
                    break;
                case "empty":
                    sb.append(qe.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(qe.isEmpty() ? -1 : qe.peek()).append('\n');
                    break;
                case "back":
                    sb.append(qe.isEmpty() ? -1 : qe.peekLast()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}