import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Boolean> map = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int i = 0; i < l; i++) {
            String input = br.readLine();
            map.remove(input);
            map.put(input, true);
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (String str: map.keySet()) {
            if (cnt == k) break;
            sb.append(str).append("\n");
            cnt++;
        }

        System.out.print(sb);
    }
}