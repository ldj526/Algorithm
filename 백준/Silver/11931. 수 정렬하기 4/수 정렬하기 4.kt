import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

lateinit var arr: IntArray
lateinit var tmp: IntArray

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    arr = IntArray(n) { br.readLine().toInt() }
    tmp = IntArray(n)
    br.close()
    mergeSort(0, n)
    for (i in n - 1 downTo 0) {
        bw.write("${arr[i]}\n")
    }
    bw.flush()
    bw.close()
}

fun merge(st: Int, en: Int) {
    val mid = (st + en) / 2
    var lIdx = st
    var rIdx = mid
    for (i in st until en) {
        if (lIdx == mid) tmp[i] = arr[rIdx++]
        else if (rIdx == en) tmp[i] = arr[lIdx++]
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