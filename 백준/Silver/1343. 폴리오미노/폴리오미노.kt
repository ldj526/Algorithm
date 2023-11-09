fun main() = with(System.`in`.bufferedReader()) {
    val board = readLine().replace("XXXX", "AAAA").replace("XX", "BB")
    print(if ('X' in board) -1 else board)
}