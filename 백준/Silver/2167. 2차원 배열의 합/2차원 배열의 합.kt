fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        val input = readLine().split(' ').map { it.toInt() }
        for (j in 0 until m) {
            arr[i][j] = input[j]
        }
    }
    val k = readLine().toInt()
    repeat(k) {
        var sum = 0
        val list = readLine().split(' ').map { it.toInt() }
        for (i in list[0] - 1 until list[2]) {
            for (j in list[1] - 1 until list[3]) {
                sum += arr[i][j]
            }
        }
        bw.write("$sum\n")
    }
    bw.close()
}