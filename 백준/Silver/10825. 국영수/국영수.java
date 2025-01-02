import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students.add(new Student(name, korean, english, math));
        }

        Collections.sort(students);

        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name).append("\n");
        }
        System.out.print(sb);
    }

    static class Student implements Comparable<Student> {
        String name;
        int korean, english, math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {
            if (this.korean != other.korean) {
                return other.korean - this.korean;
            }

            if (this.english != other.english) {
                return this.english - other.english;
            }

            if (this.math != other.math) {
                return other.math - this.math;
            }

            return this.name.compareTo(other.name);
        }
    }
}