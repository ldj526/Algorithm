import kotlin.math.sqrt

fun main() {
    val n = readln().toInt()
    val num = readln().split(" ").map { it.toInt() }
    var cnt = 0
    repeat(n) {
        cnt += isPrime(num[it])
    }
    println(cnt)
}

fun isPrime(n: Int): Int {
    if (n == 1) return 0
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return 0
    }
    return 1
}