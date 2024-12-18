import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String str1 = input[0];
            String str2 = input[1];

            if (str1.length() != str2.length()) {
                sb.append("Impossible\n");
                continue;
            }

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                sb.append("Possible\n");
            } else {
                sb.append("Impossible\n");
            }
        }

        System.out.print(sb);
    }
}