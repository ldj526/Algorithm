import kotlin.math.min

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val m = readln().toInt()
    val floyd = Array(100002) { IntArray(n + 1) { 0x3f3f3f3f } }
    val nxt = Array(100002) { IntArray(n + 1) { 0x3f3f3f3f } }
    repeat(m) {
        val num = readln().split(" ").map { it.toInt() }
        floyd[num[0]][num[1]] = min(floyd[num[0]][num[1]], num[2])
        nxt[num[0]][num[1]] = num[1]
    }
    for (i in 1..n) {
        floyd[i][i] = 0
    }
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in 1..n) {
                if (floyd[j][i] + floyd[i][k] < floyd[j][k]) {
                    floyd[j][k] = floyd[j][i] + floyd[i][k]
                    nxt[j][k] = nxt[j][i]
                }
            }
        }
    }

    for (i in 1..n) {
        for (j in 1..n) {
            if (floyd[i][j] == 0x3f3f3f3f) sb.append(0).append(' ')
            else sb.append(floyd[i][j]).append(' ')
        }
        sb.append('\n')
    }

    print(sb)
    sb.clear()

    for (i in 1..n) {
        for (j in 1..n) {
            if (floyd[i][j] == 0 || floyd[i][j] == 0x3f3f3f3f) {
                sb.append(0).append('\n')
                continue
            }
            val path = ArrayList<Int>()
            var st = i
            while (st != j) {
                path.add(st)
                st = nxt[st][j]
            }
            path.add(j)
            sb.append(path.size).append(' ')
            path.forEach {
                sb.append(it).append(' ')
            }
            sb.append('\n')
        }
        print(sb)
        sb.clear()
    }
}