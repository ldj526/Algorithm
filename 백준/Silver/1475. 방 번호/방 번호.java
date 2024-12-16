import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int[] count = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            count[digit]++;
        }

        int sixNineCount = count[6] + count[9];
        count[6] = count[9] = (sixNineCount + 1) / 2;

        int max = 0;
        for (int i = 0; i < 10; i++) {
            max = Math.max(max, count[i]);
        }

        System.out.print(max);
    }
}