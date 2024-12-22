import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            boolean isValid = true;
            int cnt = 0;

            for (char ch : input.toCharArray()) {
                if (ch == '(') {
                    cnt++;
                } else if (ch == ')') {
                    cnt--;
                    if (cnt < 0){
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && cnt == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}