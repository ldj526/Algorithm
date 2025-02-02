import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int end = 0;
        int sum = numbers[0];
        int min = Integer.MAX_VALUE;
        for (int start = 0; start < n; start++) {
            while (end < n && sum < s) {
                end++;
                if (end != n) {
                    sum += numbers[end];
                }
            }
            if (end == n) break;
            min = Math.min(min, end - start + 1);
            sum -= numbers[start];
        }
        if (min == Integer.MAX_VALUE) min = 0;

        System.out.print(min);
    }
}