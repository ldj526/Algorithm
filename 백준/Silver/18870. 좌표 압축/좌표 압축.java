import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coord = new int[n];
        int[] sorted = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            coord[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;

        for (int num: sorted) {
            if (!map.containsKey(num)) {
                map.put(num, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num: coord) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}