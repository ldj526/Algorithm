fun main() {
    val sb = StringBuilder()
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arrA = readln().split(" ").map { it.toInt() }.toIntArray()
    val arrB = readln().split(" ").map { it.toInt() }.toIntArray()
    var aIdx = 0
    var bIdx = 0
    for (i in 0 until n + m) {
        if (bIdx == m) sb.append(arrA[aIdx++]).append(' ')
        else if (aIdx == n) sb.append(arrB[bIdx++]).append(' ')
        else if (arrA[aIdx] <= arrB[bIdx]) sb.append(arrA[aIdx++]).append(' ')
        else sb.append(arrB[bIdx++]).append(' ')
    }
    print(sb)
}