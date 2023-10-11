import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val arr = IntArray(1001)
    var st = 1001
    var en = 0
    repeat(n) {
        val (a, b) = readln().split(' ').map { it.toInt() }
        arr[a] = b
        st = min(a, st)
        en = max(a, en)
    }

    val stack = Stack<Int>()
    var tmp = arr[st]
    for (i in st + 1..en) {
        if (arr[i] < tmp) {
            stack.push(i)
        } else {
            while (stack.isNotEmpty()) {
                val x = stack.pop()
                arr[x] = tmp
            }
            tmp = arr[i]
        }
    }
    stack.clear()

    tmp = arr[en]
    for (i in en - 1 downTo st) {
        if (arr[i] < tmp) stack.push(i)
        else {
            while (stack.isNotEmpty()) {
                val x = stack.pop()
                arr[x] = tmp
            }
            tmp = arr[i]
        }
    }

    var res = 0
    for (i in st..en) {
        res += arr[i]
    }
    println(res)
}