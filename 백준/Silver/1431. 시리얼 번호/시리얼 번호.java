import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] serialNum = new String[n];

        for (int i = 0; i < n; i++) {
            serialNum[i] = br.readLine();
        }

        Arrays.sort(serialNum, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }

            int sumA = getSum(a);
            int sumB = getSum(b);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String serial : serialNum) {
            sb.append(serial).append("\n");
        }

        System.out.print(sb);
    }

    private static int getSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}