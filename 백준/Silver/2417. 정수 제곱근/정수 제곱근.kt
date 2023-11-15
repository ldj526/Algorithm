fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var q = Math.sqrt(n.toDouble()).toLong()

    if (q * q < n) q++
    print(q)
}