import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = ArrayList<Person>()
    repeat(n) {
        StringTokenizer(readLine()).let {
            list.add(
                Person(
                    it.nextToken().toString(),
                    it.nextToken().toInt(),
                    it.nextToken().toInt(),
                    it.nextToken().toInt()
                )
            )
        }
    }
    val sortedList = list.sortedWith(compareBy({it.year}, {it.month}, {it.day}))
    println(sortedList[n - 1].name)
    println(sortedList[0].name)
}

data class Person(val name: String, val day: Int, val month: Int, val year: Int)