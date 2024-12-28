import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.print(recursion(A, B, C));
    }

    private static long recursion(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }
        long half = recursion(a, b / 2, c);
        half = (half * half) % c;

        if (b % 2 != 0) {
            half = (half * a) % c;
        }
        return half;
    }
}