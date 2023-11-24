import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val style = ArrayList<Style>()
    repeat(N) {
        StringTokenizer(readLine()).let {
            style.add(Style(it.nextToken(), it.nextToken().toInt()))
        }
    }
    repeat(M) {
        val input = readLine().toInt()
        var st = 0
        var en = N - 1
        while (st <= en) {
            val mid = (st + en) / 2
            if (style[mid].titlePower < input) {
                st = mid + 1
            } else {
                en = mid - 1
            }
        }
        sb.append(style[st].title).append('\n')
    }
    print(sb)
}

data class Style(val title: String, val titlePower: Int)