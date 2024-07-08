fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val lessons = readln().split(" ").map { it.toInt() }
    var st = lessons.max()
    var en = lessons.sum()

    while (st < en) {
        var cnt = 1
        val mid = (st + en) / 2
        var sum = 0
        for (lesson in lessons) {
            if (sum + lesson <= mid) {
                sum += lesson
            } else {
                sum = lesson
                cnt++
            }
        }
        if (cnt <= m) {
            en = mid
        } else {
            st = mid + 1
        }
    }
    println(st)
}