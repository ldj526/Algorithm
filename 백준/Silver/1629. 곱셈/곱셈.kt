import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a, b, c) = readln().split(" ").map { it.toLong() }
    println(recursion(a, b, c))
}

fun recursion(a: Long, b: Long, c: Long): Long {
    if (b == 1L) return a % c
    var num: Long = recursion(a, b / 2, c)
    num = num * num % c
    if (b % 2L == 0L) return num
    return num * a % c
}