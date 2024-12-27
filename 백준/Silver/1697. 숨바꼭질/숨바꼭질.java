import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 100_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.print(0);
            return;
        }

        System.out.print(bfs(N, K));
    }

    private static int bfs(int n, int k) {
        boolean[] visited = new boolean[MAX + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n, 0});
        visited[n] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int[] nextPos = {current[0] - 1, current[0] + 1, current[0] * 2};

            for (int next : nextPos) {
                if (next < 0 || next > MAX || visited[next]) {
                    continue;
                }

                if (next == k) {
                    return current[1] + 1;
                }

                queue.offer(new int[]{next, current[1] + 1});
                visited[next] = true;
            }
        }
        return -1;
    }
}