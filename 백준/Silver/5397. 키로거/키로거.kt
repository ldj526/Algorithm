import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val test = readLine().toInt()
    repeat(test) {
        val str = readLine().toString()
        val list = LinkedList<Char>()
        var cursor = 0
        for (i in str) {
            when (i) {
                '<' -> {
                    if (cursor != 0) {
                        cursor--
                    }
                }
                '>' -> {
                    if (cursor < list.size) {
                        cursor++
                    }
                }
                '-' -> {
                    if (cursor != 0 && list.isNotEmpty()) {
                        list.removeAt(--cursor)
                    }
                }
                else -> {
                    list.add(cursor++, i)
                }
            }
        }
        println(list.toCharArray())
    }
}