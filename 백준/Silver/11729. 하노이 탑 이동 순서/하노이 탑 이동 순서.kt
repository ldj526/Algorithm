val sb = StringBuilder()
fun main() {
    val k = readln().toInt()
    sb.append("${(1 shl k) - 1}\n")
    hanoi(1, 3, k)
    println(sb.toString())
}

fun hanoi(a: Int, b: Int, n: Int) {
    if (n == 1) {
        sb.append("$a $b\n")
        return
    }
    hanoi(a, 6 - a - b, n - 1)
    sb.append("$a $b\n")
    hanoi(6 - a - b, b, n - 1)
}