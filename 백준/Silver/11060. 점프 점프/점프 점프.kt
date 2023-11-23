import java.util.*
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val maze = IntArray(n)
    val dis = IntArray(n) { 1001 }
    for (i in 0 until n) {
        maze[i] = st.nextToken().toInt()
    }
    dis[0] = 0
    for (i in 0 until n) {
        if (dis[i] == 1001) continue
        for (j in 1..maze[i]) {
            if (i + j < n) {
                dis[i + j] = min(dis[i + j], dis[i] + 1)
            }
        }
    }
    println(if (dis[n - 1] == 1001) -1 else dis[n - 1])
}