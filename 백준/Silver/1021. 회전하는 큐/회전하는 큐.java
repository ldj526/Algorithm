import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        int cnt = 0;

        for (int target : list) {
            int left = 0;
            int right = 0;

            Iterator<Integer> it = dq.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    break;
                }
                left++;
            }

            right = dq.size() - left;

            if (left <= right) {
                cnt += left;
                for (int i = 0; i < left; i++) {
                    dq.addLast(dq.pollFirst());
                }
            } else {
                cnt += right;
                for (int i = 0; i < right; i++) {
                    dq.addFirst(dq.pollLast());
                }
            }

            dq.pollFirst();
        }

        System.out.print(cnt);
    }
}