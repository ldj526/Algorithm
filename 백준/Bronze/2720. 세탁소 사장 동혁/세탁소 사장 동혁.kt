fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    val coin = arrayListOf(25, 10, 5, 1)
    repeat(t) {
        var c = readln().toInt()
        val cnt = arrayListOf(0, 0, 0, 0)
        for (i in 0 until 4) {
            cnt[i] = c / coin[i]
            c %= coin[i]
            sb.append("${cnt[i]} ")
        }
        sb.append('\n')
    }
    println(sb)
}