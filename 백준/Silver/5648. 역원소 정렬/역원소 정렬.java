import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Long> reversedNumbers = new ArrayList<>();

        while (reversedNumbers.size() < n) {
            String input = sc.next();
            String reversed = new StringBuilder(input).reverse().toString();
            reversedNumbers.add(Long.parseLong(reversed));
        }

        Collections.sort(reversedNumbers);

        StringBuilder sb = new StringBuilder();
        for (long num : reversedNumbers) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }
}