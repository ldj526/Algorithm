import kotlin.math.min

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val m = readln().toInt()
    val floyd = Array(100002) { IntArray(n + 1) { 0x3f3f3f3f } }
    repeat(m) {
        val num = readln().split(" ").map { it.toInt() }
        floyd[num[0]][num[1]] = min(floyd[num[0]][num[1]], num[2])
    }
    for (i in 1 .. n) {
        floyd[i][i] = 0
    }
    for (i in 1 .. n) {
        for (j in 1 .. n) {
            for (k in 1 .. n) {
                if (floyd[j][i] + floyd[i][k] < floyd[j][k]) {
                    floyd[j][k] = floyd[j][i] + floyd[i][k]
                }
            }
        }
    }

    for (i in 1 .. n) {
        for (j in 1 .. n) {
            if (floyd[i][j] == 0x3f3f3f3f) sb.append(0).append(' ')
            else sb.append(floyd[i][j]).append(' ')
        }
        sb.append('\n')
    }
    print(sb)
}
