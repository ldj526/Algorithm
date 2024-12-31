import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members);

        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append('\n');
        }
        System.out.print(sb);
    }

    static class Member implements Comparable<Member> {
        int age;
        String name;
        int order;

        Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public int compareTo(Member other) {
            if (this.age == other.age) {
                return Integer.compare(this.order, other.order);
            }
            return Integer.compare(this.age, other.age);
        }
    }
}