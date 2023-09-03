fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val list = readln().split(' ').map { it.toInt() }
    var sum = 0
    var max = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                sum = list[i] + list[j] + list[k]
                if (sum in (max + 1)..m) max = sum
            }
        }
    }
    print(max)
}