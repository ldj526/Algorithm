import java.util.*

fun main() {
    val (n, w, l) = readln().split(' ').map { it.toInt() }
    val truck: Queue<Int> = LinkedList()
    val a = StringTokenizer(readln()).run { IntArray(n) { nextToken().toInt() } }
    for (i in a) {
        truck.offer(i)
    }
    val bridge: Queue<Int> = LinkedList()
    repeat(w) {
        bridge.offer(0)
    }
    var time = 0
    var curWeight = 0
    while (bridge.isNotEmpty()) {
        curWeight -= bridge.poll()
        if (truck.isNotEmpty()) {
            if (curWeight + truck.peek() <= l) {
                val nextTruck = truck.poll()
                curWeight += nextTruck
                bridge.offer(nextTruck)
            } else bridge.offer(0)
        }
        time++
    }

    println(time)
}