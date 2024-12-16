import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] rooms = new int[2][7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            rooms[gender][grade]++;
        }

        int roomCnt = 0;
        for (int g = 0; g <= 1; g++) {
            for (int y = 1; y <= 6; y++) {
                if (rooms[g][y] > 0) {
                    roomCnt += (rooms[g][y] + K - 1) / K;
                }
            }
        }
        System.out.print(roomCnt);
    }
}