import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int cnt = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < cnt; i++) {
                String[] input = br.readLine().split(" ");
                String name = input[0];
                String type = input[1];

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int numbers : map.values()) {
                result *= (numbers + 1);
            }

            sb.append(result - 1).append("\n");
        }

        System.out.print(sb);
    }
}