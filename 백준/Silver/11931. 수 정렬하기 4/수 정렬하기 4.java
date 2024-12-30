import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }
}