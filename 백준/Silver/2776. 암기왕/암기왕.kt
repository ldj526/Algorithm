fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val note1 = readLine().split(' ').map { it.toInt() }.sorted()
        val m = readLine().toInt()
        val note2 = readLine().split(' ').map { it.toInt() }
        repeat(m) {
            sb.append(binarySearch(note2[it], note1)).append('\n')
        }
    }
    print(sb)
}

fun binarySearch(num: Int, arr: List<Int>): Int {
    var st = 0
    var en = arr.size - 1
    while (st <= en) {
        val mid = (st + en) / 2
        if (arr[mid] < num) st = mid + 1
        else if (arr[mid] > num) en = mid - 1
        else return 1
    }
    return 0
}