import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A * B * C;

        String result = Integer.toString(sum);

        int[] cnt = new int[10];

        for (int i = 0; i < result.length(); i++) {
            int digit = result.charAt(i) - '0';
            cnt[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i]);
        }
    }
}