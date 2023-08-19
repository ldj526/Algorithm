import java.util.*

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val bucket = IntArray(n) { i -> i + 1 }
    repeat(m) {
        val st2 = StringTokenizer(readln())
        var i = st2.nextToken().toInt()
        var j = st2.nextToken().toInt()
        i--
        j--

        while (i < j) {
            val tmp = bucket[i]
            bucket[i] = bucket[j]
            bucket[j] = tmp
            i++
            j--
        }
    }
    for (i in 0 until n) {
        print("${bucket[i]} ")
    }
}