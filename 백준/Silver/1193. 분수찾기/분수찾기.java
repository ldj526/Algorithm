import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int diagonal = 1;
        int sum = 0;

        while (diagonal + sum < x) {
            sum += diagonal;
            diagonal++;
        }

        int position = x - sum;
        int numerator, dominator;

        if (diagonal % 2 == 0) {
            numerator = position;
            dominator = diagonal - position + 1;
        } else {
            numerator = diagonal - position + 1;
            dominator = position;
        }

        sb.append(numerator).append("/").append(dominator);
        System.out.print(sb);
    }
}