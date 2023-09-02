fun main() {
    val sb = StringBuilder()
    val x = mutableMapOf<Int, Int>()
    val y = mutableMapOf<Int, Int>()
    repeat(3) {
        val (a, b) = readln().split(' ').map { it.toInt() }
        val cntX = x.getOrDefault(a, 0)
        val cntY = y.getOrDefault(b, 0)
        x[a] = cntX + 1
        y[b] = cntY + 1
    }
    x.forEach {
        if (it.value == 1) {
            sb.append("${it.key} ")
        }
    }
    y.forEach {
        if(it.value == 1){
            sb.append(it.key)
        }
    }
    print(sb)
}