import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    val aList = ArrayList<Int>()
    val bList = ArrayList<Int>()
    val cList = ArrayList<Int>()

    repeat(n) {
        val input = readLine().split(' ').map { it.toInt() }
        when (input[0]) {
            1 -> {
                qe.offer(Pair(input[1], input[2]))
            }

            2 -> {
                if (input[1] == qe.peek().second) aList.add(qe.poll().first)
                else bList.add(qe.poll().first)
            }
        }
    }

    while (qe.isNotEmpty()) {
        cList.add(qe.poll().first)
    }

    if (aList.isNotEmpty()) {
        println(printList(aList))
    } else println("None")

    if (bList.isNotEmpty()) {
        println(printList(bList))
    } else println("None")

    if (cList.isNotEmpty()) {
        println(printList(cList))
    } else print("None")
}

fun printList(list: ArrayList<Int>): StringBuilder {
    val sb = StringBuilder()
    list.sort()
    list.forEach {
        sb.append(it).append(' ')
    }
    return sb
}