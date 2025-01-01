import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] cards = new long[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(cards);

        long most = cards[0];
        int maxCnt = 1;
        int curCnt = 1;

        for (int i = 1; i < n; i++) {
            if (cards[i] == cards[i - 1]) {
                curCnt++;
            } else {
                curCnt = 1;
            }

            if (curCnt > maxCnt) {
                maxCnt = curCnt;
                most = cards[i];
            }
        }

        System.out.print(most);
    }
}