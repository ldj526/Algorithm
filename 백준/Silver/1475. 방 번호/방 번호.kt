import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()
    val arr = IntArray(10)
    for (i in n) {
        arr[i - '0']++
    }
    var tmp = 0
    for (i in 0..9) {
        if (i != 6 && i != 9) {
            if (arr[i] > tmp) {
                tmp = arr[i]
            }
        }
    }
    val cnt = (arr[6] + arr[9] + 1) / 2
    if (tmp >= cnt) {
        println(tmp)
    } else {
        println(cnt)
    }
}