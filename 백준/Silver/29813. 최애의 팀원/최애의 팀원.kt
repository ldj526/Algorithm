import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val qe: Queue<Student> = LinkedList()
    repeat(N) {
        StringTokenizer(readLine()).let { st ->
            qe.offer(Student(st.nextToken(), st.nextToken().toInt()))
        }
    }
    while (qe.size != 1) {
        val cur = qe.poll()
        while (cur.num != 1) {
            qe.offer(qe.poll())
            cur.num--
        }
        qe.poll()
    }
    print(qe.peek().initial)
}

data class Student(val initial: String, var num: Int)