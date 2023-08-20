fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in 0 until n - i) print(" ")
        for (j in 0 until 2 * i - 1) print("*")
        println()
    }
    for (i in n - 1 downTo  1) {
        for (j in 1 until n - i + 1) print(" ")
        for (j in 1 until 2 * i) print("*")
        println()
    }
}