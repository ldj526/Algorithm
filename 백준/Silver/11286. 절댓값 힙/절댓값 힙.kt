import java.util.*
import kotlin.math.abs

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val heap = PriorityQueue<Int>(Comparator { a, b ->
        when {
            abs(a) == abs(b) -> a - b
            else -> abs(a) - abs(b)
        }
    })
    repeat(n) {
        val num = readln().toInt()
        if (num != 0) {
            heap.add(num)
        } else {
            if (heap.isEmpty()) {
                sb.append(0).append('\n')
            } else {
                sb.append(heap.peek()).append('\n')
                heap.poll()
            }
        }
    }
    print(sb)
}