import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        TreeSet<Integer> aSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            aSet.remove(Integer.parseInt(st.nextToken()));
        }

        System.out.println(aSet.size());

        if (!aSet.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int num : aSet) {
                sb.append(num).append(" ");
            }
            System.out.print(sb.toString().trim());
        }
    }
}