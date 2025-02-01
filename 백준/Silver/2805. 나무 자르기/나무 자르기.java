import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] trees = new long[n];

        long max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            max = Math.max(trees[i], max);
        }

        long left = 0;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                if (trees[i] > mid) {
                    sum += (trees[i] - mid);
                }
            }

            if (sum < m) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }

        System.out.print(result);
    }
}