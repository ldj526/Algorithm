lateinit var board: Array<IntArray>
val sb = StringBuilder()
fun main() {
    val n = readln().toInt()
    board = Array(n) { IntArray(n) }
    repeat(n) { i ->
        val str = readln()
        repeat(n) { j ->
            board[i][j] = str[j] - '0'
        }
    }
    quadTree(0, 0, n)
    print(sb)
}

fun quadTree(a: Int, b: Int, c: Int) {
    if (check(a, b, c)) {
        sb.append(board[a][b])
        return
    }
    val n = c / 2
    repeat(2) { i ->
        repeat(2) { j ->
            quadTree(a + i * n, b + j * n, n)
        }
    }
    sb.append(")")
}

fun check(a: Int, b: Int, c: Int): Boolean {
    for (i in a until a + c) {
        for (j in b until b + c) {
            if (board[a][b] != board[i][j]) {
                sb.append("(")
                return false
            }
        }
    }
    return true
}