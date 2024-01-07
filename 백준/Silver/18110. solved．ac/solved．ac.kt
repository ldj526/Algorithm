import kotlin.math.roundToInt

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 0) {
        print(0)
        return@with
    }
    val opinion = IntArray(n)
    repeat(n) {
        opinion[it] = readLine().toInt()
    }
    val sortedOpinion = opinion.sorted()
    val except = (n * 0.15).roundToInt()
    var sum = 0.0
    for (i in except until (n - except)) {
        sum += sortedOpinion[i]
    }
    print((sum / (n - 2 * except)).roundToInt())
}