import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        String[] parts = expression.split("-");
        int result = 0;

        result += sumOfParts(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            result -= sumOfParts(parts[i]);
        }

        System.out.print(result);
    }

    private static int sumOfParts(String part) {
        String[] numbers = part.split("\\+");
        int sum = 0;

        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}