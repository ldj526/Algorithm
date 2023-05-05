import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val arr = mutableListOf<String>()
    for (i in 0 until n) {
        arr.add(br.readLine())
    }
    arr.sortWith(compareBy(
        { it.length },
        { it.filter { it2 -> it2.isDigit() }.sumOf { it3 -> it3.digitToInt() } },
        { it }
    ))
    arr.forEach {
        println(it)
    }
}