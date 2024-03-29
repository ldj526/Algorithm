import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val arr = Array(2) { IntArray(7) }
    for (i in 0 until n) {
        val st1 = StringTokenizer(br.readLine())
        val s = st1.nextToken().toInt()
        val y = st1.nextToken().toInt()
        arr[s][y]++
    }
    var cnt = 0
    for (i in 0..6) {
        if (arr[0][i] % k == 0) {
            cnt += arr[0][i] / k
        } else {
            cnt += arr[0][i] / k + 1
        }
        if (arr[1][i] % k == 0) {
            cnt += arr[1][i] / k
        } else {
            cnt += arr[1][i] / k + 1
        }
    }
    println(cnt)
}