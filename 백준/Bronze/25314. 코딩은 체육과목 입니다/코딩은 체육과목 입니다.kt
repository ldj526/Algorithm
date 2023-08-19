fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()
    repeat(n / 4) {
        sb.append("long ")
    }
    sb.append("int")
    print(sb)
}