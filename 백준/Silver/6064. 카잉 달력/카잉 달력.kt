val sb = StringBuilder()
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val list = readln().split(" ").map { it.toInt() }.toMutableList()
        solution(list)
    }
    print(sb)
}

fun gcd(a: Int, b: Int): Int {
    if (a == 0) return b
    return gcd(b % a, a)
}

fun lcm(a: Int, b: Int): Int {
    return a / gcd(a, b) * b
}

fun solution(list: MutableList<Int>): java.lang.StringBuilder? {
    val num = lcm(list[0], list[1])
    if (list[0] == list[2]) list[2] = 0
    if (list[1] == list[3]) list[3] = 0
    for (i in list[2]..num step list[0]) {
        if (i == 0) continue
        if (i % list[1] == list[3]) return sb.append(i).append('\n')
    }
    return sb.append(-1).append('\n')
}