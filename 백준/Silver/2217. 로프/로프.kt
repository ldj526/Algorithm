import java.lang.Integer.max

fun main() {
    val n = readln().toInt()
    val list = ArrayList<Int>(100_002)
    for (i in 0 until n) {
        list.add(readln().toInt())
    }
    list.sort()
    var weight = 0
    for (i in 1..n) {
        weight = max(weight, list[n - i] * i)
    }
    println(weight)
}