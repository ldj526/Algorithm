import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> qe = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            qe.add(i);
        }

        sb.append('<');

        while(!qe.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                qe.add(qe.poll());
            }
            sb.append(qe.poll());

            if (!qe.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append('>');

        System.out.print(sb);
    }
}