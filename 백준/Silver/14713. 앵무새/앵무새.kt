import java.util.*

fun main() {
    val n = readln().toInt()
    val qe = Array(n) { LinkedList<String>() }
    val l: Queue<String> = LinkedList()
    for (i in 0 until n) {
        qe[i] = LinkedList<String>()
    }
    for (i in 0 until n) {
        val s = readln().split(" ")
        for (j in s.indices) qe[i].offer(s[j])
    }
    val str = readln().split(" ")
    for (i in str.indices) l.offer(str[i])

    while (l.isNotEmpty()) {
        val word = l.poll()
        var flag = false
        for (i in 0 until n) {
            if (word.equals(qe[i].peek())) {
                qe[i].poll()
                flag = true
                break
            }
        }
        if (!flag) {
            print("Impossible")
            return
        }
    }
    for (i in 0 until n) {
        if (qe[i].isNotEmpty()) {
            print("Impossible")
            return
        }
    }
    print("Possible")
}