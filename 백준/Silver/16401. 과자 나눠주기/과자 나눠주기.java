import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] snacks = new int[n];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            snacks[i] = Integer.parseInt(st.nextToken());
            max = Math.max(snacks[i], max);
        }

        int left = 1;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int snack : snacks) {
                cnt += snack / mid;
            }
            if (cnt >= m) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.print(result);
    }
}