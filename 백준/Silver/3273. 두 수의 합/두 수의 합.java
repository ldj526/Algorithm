import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int[] seq = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        int cnt = 0;

        Set<Integer> set = new HashSet<>();

        for (int num : seq) {
            int needed = target - num;
            if (set.contains(needed)) {
                cnt++;
            }
            set.add(num);
        }
        System.out.println(cnt);
    }
}