import java.util.*

fun main() {
    val n = readln().toInt()
    val heap = PriorityQueue<Int>()
    repeat(n) {
        heap.add(readln().toInt())
    }
    var sum = 0
    repeat(n - 1) {
        var a = heap.peek()
        heap.poll()
        var b = heap.peek()
        heap.poll()
        sum += a + b
        heap.add(a + b)
    }
    println(sum)
}