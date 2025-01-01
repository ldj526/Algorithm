import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> alphabets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            alphabets.add(br.readLine());
        }

        List<String> sortedAlpha = new ArrayList<>(alphabets);
        Collections.sort(sortedAlpha, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });

        StringBuilder sb = new StringBuilder();
        for (String str : sortedAlpha) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}