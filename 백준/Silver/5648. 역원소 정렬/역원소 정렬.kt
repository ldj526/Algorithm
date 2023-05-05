import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = LongArray(n)
    for (i in 0 until n) {
        val str = sc.next()
        val revStr = str.reversed().toLong()
        arr[i] = revStr
    }
    arr.sort()
    arr.forEach {
        println(it)
    }
}