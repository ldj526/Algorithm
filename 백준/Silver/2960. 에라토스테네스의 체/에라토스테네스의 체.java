import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] isRemoved = new boolean[n + 1];
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (!isRemoved[i]) {
                for (int j = i; j <= n; j += i) {
                    if (!isRemoved[j]) {
                        isRemoved[j] = true;
                        cnt++;
                        if (cnt == k) {
                            System.out.print(j);
                            return;
                        }
                    }
                }
            }
        }
    }
}