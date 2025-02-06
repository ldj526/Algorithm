import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, ArrayList<String>> teamMembers = new HashMap<>();
        HashMap<String, String> memberToTeam = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String teamName = br.readLine();
            int cnt = Integer.parseInt(br.readLine());
            ArrayList<String> members = new ArrayList<>();

            for (int j = 0; j < cnt; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                memberToTeam.put(memberName, teamName);
            }

            Collections.sort(members);
            teamMembers.put(teamName, members);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            int zeroOrOne = Integer.parseInt(br.readLine());

            if (zeroOrOne == 0) {
                ArrayList<String> members = teamMembers.get(input);
                for (String name: members) {
                    sb.append(name).append("\n");
                }
            } else {
                sb.append(memberToTeam.get(input)).append("\n");
            }
        }

        System.out.print(sb);
    }
}