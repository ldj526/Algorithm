import java.util.*

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(n) { i -> i + 1 }
    repeat(m) {
        val st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        val tmp = arr[a - 1]
        arr[a - 1] = arr[b - 1]
        arr[b - 1] = tmp
    }
    for (i in arr.indices) {
        print("${arr[i]} ")
    }
}