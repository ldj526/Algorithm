import java.util.*

fun main() {
    val arr = Array(9) { IntArray(9) }
    var a = 0
    var b = 0
    var max = 0
    for (i in 0 until 9) {
        val st = StringTokenizer(readln())
        for (j in 0 until 9) {
            arr[i][j] = st.nextToken().toInt()
            if (max <= arr[i][j]) {
                max = arr[i][j]
                a = i + 1
                b = j + 1
            }
        }
    }
    println(max)
    print("$a $b")
}