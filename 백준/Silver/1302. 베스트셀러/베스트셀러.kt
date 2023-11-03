fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val book = HashMap<String, Int>()
    repeat(n) {
        val title = readLine()
        book[title] = book.getOrDefault(title, 0) + 1
    }
    val answer = book.toList().sortedWith(compareBy({ -it.second }, { it.first }))
    println(answer[0].first)
}