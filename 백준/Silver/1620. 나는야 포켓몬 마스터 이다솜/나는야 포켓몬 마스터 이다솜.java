import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] pokemon = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            pokemon[i] = name;
            map.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
                int number = Integer.parseInt(input);
                sb.append(pokemon[number]).append("\n");
            } else {
                sb.append(map.get(input)).append("\n");
            }
        }

        System.out.print(sb);
    }
}