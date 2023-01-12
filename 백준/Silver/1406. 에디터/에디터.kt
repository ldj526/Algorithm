import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val list = LinkedList<Char>()
    for (i in str) {
        list.add(i)
    }
    val itr = list.listIterator()
    while (itr.hasNext()) {
        itr.next()
    }
    val n = readLine().toInt()
    repeat(n) {
        val ch = readLine()
        when (ch[0]) {
            'L' -> {
                if (itr.hasPrevious()) {
                    itr.previous()
                }
            }

            'D' -> {
                if (itr.hasNext()) {
                    itr.next()
                }
            }

            'B' -> {
                if (itr.hasPrevious()) {
                    itr.previous()
                    itr.remove()
                }
            }

            'P' -> {
                itr.add(ch[2])
            }
        }
    }
    println(list.toCharArray())
}