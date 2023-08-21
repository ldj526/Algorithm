fun main() {
    val (n, b) = readln().split(' ').map { it.toInt() }
    val result = StringBuilder()
    var a = n
    while (a > 0) {
        if (a % b in 0..9) {
            result.append(((a % b) + '0'.code).toChar())
        } else {
            result.append(((a % b) - 10 + 'A'.code).toChar())
        }
        a /= b
    }
    print(result.reverse())
}