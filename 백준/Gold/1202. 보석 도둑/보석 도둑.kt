import java.util.*

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val jewel = ArrayList<Pair<Int, Int>>()
    repeat(n) {
        val num = readln().split(" ").map { it.toInt() }
        jewel.add(Pair(num[0], num[1]))
    }
    jewel.sortWith(compareBy { it.second })
    val bag = TreeMap<Int, Int>()
    repeat(k) {
        val a = readln().toInt()
        bag[a] = bag.getOrDefault(a, 0) + 1
    }
    var sum = 0L
    for (i in n - 1 downTo 0) {
        if (bag.isEmpty()) continue
        val key = bag.ceilingEntry(jewel[i].first)
        if (key != null) {
            sum += jewel[i].second
            val abc = key.key
            val value = key.value - 1
            if (value == 0)
                bag.remove(abc)
            else
                bag[abc] = value
        }
    }
    println(sum)
}