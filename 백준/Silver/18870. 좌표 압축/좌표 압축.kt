fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val listA = readln().split(" ").map { it.toInt() }
    val sortListA = listA.sorted().toMutableList()
    val setList = mutableListOf<Int>()
    for (i in 0 until n) {
        if (i == 0 || sortListA[i] != sortListA[i - 1]) {
            setList.add(sortListA[i])
        }
    }
    for (i in 0 until n) {
        sb.append("${lowerIdx(setList, listA[i])}").append(' ')
    }
    print(sb)
}

fun lowerIdx(setList: MutableList<Int>, num: Int): Int {
    var st = 0
    var en = setList.size
    while (st < en) {
        val mid = (st + en) / 2
        if (setList[mid] >= num) en = mid
        else st = mid + 1
    }
    return st
}