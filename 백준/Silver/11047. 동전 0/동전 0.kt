import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    var k = st.nextToken().toInt()
    val coin = Array(n) { 0 }
    var sum = 0
    repeat(n) {
        coin[it] = readln().toInt()
    }
    for (i in n - 1 downTo 0) {
        sum += k / coin[i]
        k %= coin[i]
    }
    println(sum)
}