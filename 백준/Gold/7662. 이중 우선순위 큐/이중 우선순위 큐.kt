import java.util.*

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    repeat(n) {
        val map = TreeMap<Int, Int>()
        val k = readln().toInt()
        for (i in 0 until k) {
            val input = readln().split(" ")
            if (input[0] == "I") {
                map[input[1].toInt()] = map.getOrDefault(input[1].toInt(), 0) + 1
            } else {
                if (map.isEmpty()) continue
                val key = if (input[1] == "1") map.lastKey() else map.firstKey()
                val keyCnt = map[key]
                if (keyCnt == 1) map.remove(key)
                else map[key] = keyCnt!! - 1
            }
        }
        if (map.isEmpty()) sb.append("EMPTY").append('\n')
        else {
            sb.append("${map.lastKey()} ${map.firstKey()}").append('\n')
        }
    }
    print(sb)
}