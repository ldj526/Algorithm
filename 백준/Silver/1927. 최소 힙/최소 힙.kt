import java.util.PriorityQueue

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val heap = PriorityQueue<Int>()
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
