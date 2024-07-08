import java.util.*
import kotlin.collections.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val dq = ArrayDeque<Pair<Char, Int>>()
    val st = Stack<Pair<Char, Int>>()
    var idx = 0
    repeat(n) {
        val input = readln().split(" ")
        when (input[0]) {
            "1" -> {
                val c = input[1][0]
                dq.addLast(Pair(c, idx))
                st.push(Pair(c, idx))
                idx++
            }

            "2" -> {
                val c = input[1][0]
                dq.addFirst(Pair(c, idx))
                st.push(Pair(c, idx))
                idx++
            }

            "3" -> {
                if (st.isNotEmpty()) {
                    val last = st.pop()
                    dq.remove(last)
                }
            }
        }
    }
    if (dq.isEmpty()) {
        println("0")
    } else {
        println(dq.joinToString("") { it.first.toString() })
    }
}