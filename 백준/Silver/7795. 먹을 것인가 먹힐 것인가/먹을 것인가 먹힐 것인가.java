import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] aArr = new int[a];
            int[] bArr = new int[b];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < a; i++) {
                aArr[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < b; i++) {
                bArr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(aArr);
            Arrays.sort(bArr);

            int cnt = 0;

            for (int num : aArr) {
                cnt += lower(bArr, num);
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }

    private static int lower(int[] bArr, int target) {
        int low = 0;
        int high = bArr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (bArr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}