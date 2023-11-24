import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    if (N == 1) print(1)
    else if (N == 2) print(min(4, (M + 1) / 2))
    else if (M < 7) print(min(4, M))
    else print(M - 7 + 5)
}