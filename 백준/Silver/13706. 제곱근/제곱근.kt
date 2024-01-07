import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toBigInteger()
    var st = (0).toBigInteger()
    var en = n
    var mid: BigInteger
    while (st <= en) {
        mid = (st + en) / (2).toBigInteger()
        if (mid * mid == n) {
            print(mid)
            return@with
        } else if (mid * mid > n) {
            en = mid - (1).toBigInteger()
        } else {
            st = mid + (1).toBigInteger()
        }
    }
}