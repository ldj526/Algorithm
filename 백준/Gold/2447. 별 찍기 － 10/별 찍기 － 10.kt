lateinit var board: Array<CharArray>
fun main() {
    val n = readln().toInt()
    board = Array(n) { CharArray(n) { ' ' } }

    star(0, 0, n)

    repeat(n) { i ->
        println(board[i])
    }
}

fun star(a: Int, b: Int, n: Int) {
    if (n == 1) {
        board[a][b] = '*'
        return
    }
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (i == 1 && j == 1) continue
            star(a + n / 3 * i, b + n / 3 * j, n / 3)
        }
    }
}