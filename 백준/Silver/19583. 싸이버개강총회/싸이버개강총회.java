import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String start = st.nextToken();
        String exit = st.nextToken();
        String quit = st.nextToken();

        HashSet<String> entranceSet = new HashSet<>();
        HashSet<String> exitSet = new HashSet<>();

        while (true) {
            String input = br.readLine();
            if (input == null || input.equals("")) break;
            String[] parts = input.split(" ");
            String time = parts[0];
            String name = parts[1];

            if (time.compareTo(start) <= 0) {
                entranceSet.add(name);
            }

            if (time.compareTo(exit) >= 0 && time.compareTo(quit) <= 0) {
                exitSet.add(name);
            }
        }
        entranceSet.retainAll(exitSet);

        System.out.print(entranceSet.size());
    }
}