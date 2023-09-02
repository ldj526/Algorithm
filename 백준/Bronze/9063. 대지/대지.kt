import kotlin.math.max
import kotlin.math.min

fun main() {
    val n = readln().toInt()
    var maxX = -10001
    var maxY = -10001
    var minX = 10001
    var minY = 10001
    repeat(n) {
        val (a, b) = readln().split(' ').map { it.toInt() }
        maxX = max(maxX, a)
        minX = min(minX, a)
        maxY = max(maxY, b)
        minY = min(minY, b)
    }
    print((maxX - minX) * (maxY - minY))
}