fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    var num = 1
    for (i in 0 until k) num *= n - i
    for (i in 1..k) num /= i
    println(num)
}