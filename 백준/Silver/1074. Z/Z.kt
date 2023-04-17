fun main() {
    val (n, r, c) = readln().split(" ").map { it.toInt() }
    println(zed(n, r, c))
}

fun zed(n: Int, r: Int, c: Int): Int {
    if (n == 0) return 0
    val rec = (1 shl (n - 1))
    if (r < rec && c < rec) return zed(n - 1, r, c)
    if (rec in (r + 1)..c) return rec * rec + zed(n - 1, r, c - rec)
    if (rec in (c + 1)..r) return 2 * rec * rec + zed(n - 1, r - rec, c)
    return 3 * rec * rec + zed(n - 1, r - rec, c - rec)
}