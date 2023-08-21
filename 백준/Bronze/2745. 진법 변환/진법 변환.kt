fun main() {
    val (n, b) = readln().split(' ').map { it }
    var result = 0

    for (i in n.indices) {
        result = if (n[i] in '0'..'9') {
            result * b.toInt() + (n[i] - '0')
        } else {
            result * b.toInt() + (n[i] - 'A' + 10)
        }
    }
    print(result)
}