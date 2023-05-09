import kotlin.math.sqrt

val state = BooleanArray(1_000_000) { true }
fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    sieve(n)
    for (i in m..n) {
        if (state[i]) {
            println(i)
        }
    }
}

fun sieve(n: Int) {
    state[1] = false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (!state[i]) continue
        for (j in (i * i)..n step i) {
            state[j] = false
        }
    }
}