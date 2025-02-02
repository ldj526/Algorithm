import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);
        
        int end = 0;
        int min = Integer.MAX_VALUE;
        for (int start = 0; start < n; start++) {
            while (end < n && numbers[end] - numbers[start] < m) end++;
            if (end == n) break;
            min = Math.min(min, numbers[end] - numbers[start]);
        }

        System.out.print(min);
    }
}