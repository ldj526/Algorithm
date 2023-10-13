import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = br.readLine().toInt()
    val sb = StringBuilder()
    val balloon = br.readLine().split(" ")
    val dq = ArrayDeque((1..n).map { Balloon(it, balloon[it - 1].toInt()) })
    while (true) {
        val tmp = dq.removeFirst()
        sb.append("${tmp.num} ")

        if (dq.isEmpty()) break

        if (tmp.balloon > 0) {
            for (i in 1 until tmp.balloon) {
                dq.addLast(dq.removeFirst())
            }
        } else {
            for (i in 1..abs(tmp.balloon)) {
                dq.addFirst(dq.removeLast())
            }
        }
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
    br.close()
}

data class Balloon(val num: Int, val balloon: Int)