fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    println(comb(n, k))
}

fun comb(n: Int, k: Int): Int {
    val list = Array(1002) { IntArray(1002) }
    for (i in 1..n) {
        list[i][0] = 1
        list[i][i] = 1
        for (j in 1 until i) {
            list[i][j] = (list[i - 1][j] + list[i - 1][j - 1]) % 10007
        }
    }
    return list[n][k]
}