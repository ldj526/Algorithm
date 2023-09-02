fun main() {
    val sb = StringBuilder()
    while (true) {
        val (a, b) = readln().split(' ').map { it.toInt() }
        if (a == b && b == 0) break
        if (a % b == 0) {
            sb.append("multiple\n")
        } else if (b % a == 0) {
            sb.append("factor\n")
        } else {
            sb.append("neither\n")
        }
    }
    println(sb)
}