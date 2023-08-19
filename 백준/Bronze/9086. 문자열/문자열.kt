fun main() {
    val sb = StringBuilder()
    val t = readln().toInt()
    repeat(t) {
        val s = readln()
        sb.append(s.first()).append(s.last()).append('\n')
    }
    println(sb)
}