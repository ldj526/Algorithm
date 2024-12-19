import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '>':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '-':
                        if (it.hasPrevious()) {
                            it.previous();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(ch);
                        break;
                }
            }

            for (char ch : list) {
                sb.append(ch);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}