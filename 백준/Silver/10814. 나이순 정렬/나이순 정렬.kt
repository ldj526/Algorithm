import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val arr = arrayListOf<Pair<Int, String>>()
    for (i in 0 until n) {
        val str = br.readLine().split(" ")
        arr.add(Pair(str[0].toInt(), str[1]))
    }
    val sortedArr = arr.sortedWith(compareBy { it.first})
    for (i in 0 until n) {
        println("${sortedArr[i].first} ${sortedArr[i].second}")
    }
}
