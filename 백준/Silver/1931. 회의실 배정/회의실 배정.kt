import java.util.*

fun main() {
    val n = readln().toInt()
    val meeting = ArrayList<Pair<Int, Int>>()
    for (i in 0 until n) {
        val st = StringTokenizer(readln())
        meeting.add(Pair(st.nextToken().toInt(), st.nextToken().toInt()))
    }
    val meetComp = compareBy<Pair<Int, Int>> { it.second }
    meeting.sortWith(meetComp.thenBy { it.first })
    var cnt = 0
    var time = 0
    for (i in 0 until n) {
        if (time > meeting[i].first) continue
        cnt++
        time = meeting[i].second
    }
    println(cnt)
}