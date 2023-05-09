fun main() {
    val n = readln().toInt()
    val listA = readln().split(" ").map { it.toInt() }.sorted()
    val listB = readln().split(" ").map { it.toInt() }.sortedDescending()
    var sum = 0
    for (i in 0 until n) {
        sum += listA[i] * listB[i]
    }
    println(sum)
}