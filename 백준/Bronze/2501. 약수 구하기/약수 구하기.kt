fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    val num = arrayListOf<Int>()
    for (i in a downTo 1) {
        if (a % i == 0) {
            num.add(a / i)
        }
    }
    if (num.size < b) {
        print(0)
    } else {
        print(num[b - 1])
    }
}