import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i) + " ".repeat(2 * n - 2 * i) + "*".repeat(i));
        }
        for (int i = n - 1; i >= 1 ; i--) {
            System.out.println("*".repeat(i) + " ".repeat(2 * n - 2 * i) + "*".repeat(i));

        }
    }
}