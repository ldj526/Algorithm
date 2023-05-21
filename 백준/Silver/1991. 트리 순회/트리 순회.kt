lateinit var left: Array<Int>
lateinit var right: Array<Int>
val sb = StringBuilder()

fun main() {
    val n = readln().toInt()
    left = Array(27) { 0 }
    right = Array(27) { 0 }
    repeat(n) {
        val str = readln().split(" ")
        val center = str[0].single()
        val l = str[1].single()
        val r = str[2].single()
        if (l != '.') {
            left[center - 'A' + 1] = l - 'A' + 1
        }
        if (r != '.') {
            right[center - 'A' + 1] = r - 'A' + 1
        }
    }
    preOrder(1)
    println(sb)
    sb.clear()
    inOrder(1)
    println(sb)
    sb.clear()
    postOrder(1)
    println(sb)
}

fun preOrder(cur: Int) {
    sb.append(Char(cur + 64))
    if (left[cur] != 0) preOrder(left[cur])
    if (right[cur] != 0) preOrder(right[cur])
}

fun inOrder(cur: Int) {
    if (left[cur] != 0) inOrder(left[cur])
    sb.append(Char(cur + 64))
    if (right[cur] != 0) inOrder(right[cur])
}

fun postOrder(cur: Int) {
    if (left[cur] != 0) postOrder(left[cur])
    if (right[cur] != 0) postOrder(right[cur])
    sb.append(Char(cur + 64))
}