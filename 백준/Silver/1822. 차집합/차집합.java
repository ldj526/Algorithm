import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> aSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            aSet.remove(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> sortedList = new ArrayList<>(aSet);
        Collections.sort(sortedList);

        System.out.println(sortedList.size());

        if (!aSet.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int num : sortedList) {
                sb.append(num).append(" ");
            }
            System.out.print(sb.toString().trim());
        }
    }
}