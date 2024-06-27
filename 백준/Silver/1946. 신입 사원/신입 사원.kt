fun main() = with(System.`in`.bufferedReader()) {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val applicants = Array(n) {
            val (a, b) = readln().split(' ').map { it.toInt() }
            a to b
        }

        applicants.sortBy { it.first }

        var cnt = 1
        var bestInterviewRank = applicants[0].second

        for (i in 1 until n) {
            if (applicants[i].second < bestInterviewRank) {
                cnt++
                bestInterviewRank = applicants[i].second
            }
        }
        println(cnt)
    }
}