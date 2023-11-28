import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val N = readLine().toInt()
    val answer = IntArray(52)
    val p = mutableMapOf<Int, Int>()
    val st = StringTokenizer(readLine())
    for (i in 0 until N) {
        p[i] = st.nextToken().toInt()
    }
    var cnt = 0
    val sortedP = p.toList().sortedWith(compareBy({ it.second }, { it.first }))
    sortedP.forEach {
        answer[it.first] = cnt++
    }
    for (i in sortedP.indices){
        sb.append(answer[i]).append(" ")
    }
    println(sb)
}