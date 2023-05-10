fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    var listA = readln().split(" ").map { it.toInt() }
    listA = listA.sorted().toMutableList()
    val m = readln().toInt()
    val listB = readln().split(" ").map { it.toInt() }
    for (i in 0 until m) {
        sb.append("${upperIdx(listA, listB[i], n) - lowerIdx(listA, listB[i], n)}").append(' ')
    }
    print(sb)
}

fun lowerIdx(listA: MutableList<Int>, num: Int, n: Int): Int {
    var st = 0
    var en = n
    while (st < en) {
        val mid = (st + en) / 2
        if (listA[mid] >= num) en = mid
        else st = mid + 1
    }
    return st
}

fun upperIdx(listA: MutableList<Int>, num: Int, n: Int): Int {
    var st = 0
    var en = n
    while (st < en) {
        val mid = (st + en) / 2
        if (listA[mid] > num) en = mid
        else st = mid + 1
    }
    return st
}