import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        dp[1] = 0;
        if (n >= 2) dp[2] = 1;
        if (n >= 3) dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(dp[n]).append("\n");

        while (n > 0) {
            sb.append(n).append(" ");
            if (n % 3 == 0 && dp[n] == dp[n / 3] + 1) {
                n /= 3;
            } else if (n % 2 == 0 && dp[n] == dp[n / 2] + 1) {
                n /= 2;
            } else {
                n -= 1;
            }
        }

        System.out.print(sb);
    }
}