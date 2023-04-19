lateinit var board: Array<IntArray>
lateinit var cnt: IntArray
fun main() {
    val n = readln().toInt()
    board = Array(n) { IntArray(n) }
    cnt = IntArray(3) { 0 }
    repeat(n) { i ->
        val list = readln().split(" ").map { it.toInt() }
        repeat(n) { j ->
            board[i][j] = list[j]
        }
    }
    paper(0, 0, n)
    repeat(3) {
        print("${cnt[it]} ")
    }
}

fun paper(a: Int, b: Int, c: Int) {
    if (check(a, b, c)) {
        cnt[board[a][b] + 1]++
        return
    }
    val n = c / 3
    repeat(3) { i ->
        repeat(3) { j ->
            paper(a + i * n, b + j * n, n)
        }
    }
}

fun check(a: Int, b: Int, c: Int): Boolean {
    for (i in a until a + c) {
        for (j in b until b + c) {
            if (board[a][b] != board[i][j]) {
                return false
            }
        }
    }
    return true
}