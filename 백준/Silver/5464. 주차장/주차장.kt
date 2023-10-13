import java.util.*
import kotlin.math.abs

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val parkingLot = IntArray(n + 1)
    val unit = IntArray(n + 1)
    val fee = IntArray(m + 1)
    val qe: Queue<Int> = LinkedList()
    var sum = 0
    for (i in 1..n) {
        unit[i] = readln().toInt()
    }
    for (i in 1..m) {
        fee[i] = readln().toInt()
    }
    repeat(2 * m) {
        val car = readln().toInt()
        if (car > 0) {
            for (j in 1..n) {
                if (parkingLot[j] == 0) {
                    parkingLot[j] = car
                    return@repeat
                }
            }
            qe.offer(car)
        } else {
            for (j in 1..n) {
                if (parkingLot[j] == abs(car)) {
                    parkingLot[j] = 0
                    sum += unit[j] * fee[abs(car)]
                    if (qe.isNotEmpty()) parkingLot[j] = qe.poll()
                    break
                }
            }
        }
    }
    print(sum)
}