fun main() {
    val arr = Array(100) { IntArray(100) }
    val n = readln().toInt()
    repeat(n) {
        val (x, y) = readln().split(' ').map { it.toInt() }
        for (i in y until y + 10) {
            arr[i].fill(1, x, x + 10)
        }
    }
    var cnt = 0
    for (i in 0 until 100){
        for (j in 0 until 100){
            if(arr[i][j]==1){
                cnt++
            }
        }
    }
    println(cnt)
}