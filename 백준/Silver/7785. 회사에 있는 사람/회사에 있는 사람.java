import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if (input[1].equals("enter")) {
                set.add(input[0]);
            } else {
                set.remove(input[0]);
            }
        }

        ArrayList<String> result = new ArrayList<>(set);
        result.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}