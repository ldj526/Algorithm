import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val sb = StringBuilder()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val arr = IntArray(2_000_002)
    for (i in 0 until n) {
        val a = br.readLine().toInt()
        arr[a + 1_000_000]++
    }
    for (i in 0..2_000_000) {
        while (arr[i] > 0) {
            sb.append(i - 1_000_000).append('\n')
            arr[i]--
        }
    }
    print(sb)
}