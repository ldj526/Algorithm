import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int cnt : arr){
            sb.append(cnt).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}