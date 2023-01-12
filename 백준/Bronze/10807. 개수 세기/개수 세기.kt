import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    var v = readLine().toInt()
    var cnt = 0
    for (i in arr) {
        if (v + 100 == i + 100) {
            cnt++
        }
    }
    println(cnt)
}