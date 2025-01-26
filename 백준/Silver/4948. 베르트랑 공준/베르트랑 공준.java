import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = 246912;
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;

            int cnt = 0;
            for (int i = input + 1; i <= input * 2; i++) {
                if (isPrime[i]) cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}