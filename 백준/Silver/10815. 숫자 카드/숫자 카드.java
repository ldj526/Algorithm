import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (binarySearch(cards, num)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
    }

    private static boolean binarySearch(int[] cards, int num) {
        int left = 0;
        int right = cards.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (cards[mid] == num) {
                return true;
            } else if (cards[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}