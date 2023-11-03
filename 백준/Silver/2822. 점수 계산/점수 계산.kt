fun main() = with(System.`in`.bufferedReader()) {
    val score = IntArray(8) { readLine().toInt() }
    val sortedScore = score.sortedArrayDescending()

    val topScore = sortedScore.take(5)
    val totalScore = topScore.sum()

    val number = ArrayList<Int>()
    for (i in topScore) {
        val index = score.indexOf(i) + 1
        number.add(index)
    }
    number.sort()

    println(totalScore)
    print(number.joinToString(" "))
}