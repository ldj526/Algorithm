import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val arr = LongArray(n)
    for (i in 0 until n) {
        arr[i] = br.readLine().toLong()
    }
    arr.sort()
    var mxCnt = 0
    var cnt = 0
    var mxVal = -(1 shl 62) - 1L
    for (i in 0 until n) {
        if (i == 0 || arr[i - 1] == arr[i]) cnt++
        else {
            if (mxCnt < cnt) {
                mxCnt = cnt
                mxVal = arr[i - 1]
            }
            cnt = 1
        }
    }
    if (cnt > mxCnt) mxVal = arr[n - 1]
    println(mxVal)
}