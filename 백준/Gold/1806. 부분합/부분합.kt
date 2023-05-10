fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    var en = 0
    var min = 0x7f7f7f7f
    var sum = list[0]
    for (st in 0 until n) {
        while (en < n && sum < s) {
            en++
            if (en != n) sum += list[en]
        }
        if (en == n) break
        min = Math.min(min, en - st + 1)
        sum -= list[st]
    }
    if (min == 0x7f7f7f7f) min = 0
    print(min)
}