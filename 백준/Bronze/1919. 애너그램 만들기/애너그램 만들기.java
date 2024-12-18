import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : str1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            count2[c - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(count1[i] - count2[i]);
        }

        System.out.print(cnt);
    }
}