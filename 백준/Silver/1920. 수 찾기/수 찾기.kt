fun main() {
    val n = readln().toInt()
    var listA = readln().split(" ").map { it.toInt() }
    listA = listA.sorted().toMutableList()
    val m = readln().toInt()
    val listB = readln().split(" ").map { it.toInt() }
    for (i in 0 until m) {
        println(binary(listA, listB[i], n))
    }
}

fun binary(listA: MutableList<Int>, num: Int, n: Int): Int {
    var st = 0
    var en = n - 1
    while (st <= en) {
        val mid = (st + en) / 2
        if (listA[mid] > num) {
            en = mid - 1
        } else if (listA[mid] < num) {
            st = mid + 1
        } else {
            return 1
        }
    }
    return 0
}