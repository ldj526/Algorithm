var n = 0
lateinit var arr: IntArray
lateinit var tmp: IntArray
val sb = StringBuilder()

fun main() {
    n = readln().toInt()
    arr = IntArray(n) { readln().toInt() }
    tmp = IntArray(n)
    mergeSort(0, n)
    for (i in 0 until n) {
        sb.append("${arr[i]}\n")
    }
    println(sb)
}

fun merge(st: Int, en: Int) {
    val mid = (st + en) / 2
    var lIdx = st
    var rIdx = mid
    for (i in st until en) {
        if (rIdx == en) tmp[i] = arr[lIdx++]
        else if (lIdx == mid) tmp[i] = arr[rIdx++]
        else if (arr[lIdx] <= arr[rIdx]) tmp[i] = arr[lIdx++]
        else tmp[i] = arr[rIdx++]
    }
    for (i in st until en) {
        arr[i] = tmp[i]
    }
}

fun mergeSort(st: Int, en: Int) {
    if (st + 1 == en) return
    val mid = (st + en) / 2
    mergeSort(st, mid)
    mergeSort(mid, en)
    merge(st, en)
}