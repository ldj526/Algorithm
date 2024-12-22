import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int pieces = 0;
        int stack = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack++;
            } else {
                stack--;
                if (input.charAt(i - 1) == '(') {
                    pieces += stack;
                } else {
                    pieces++;
                }
            }
        }

        System.out.print(pieces);
    }
}