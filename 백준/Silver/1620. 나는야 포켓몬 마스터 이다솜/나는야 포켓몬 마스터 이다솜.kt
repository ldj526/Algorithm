fun main() {
    val sb = StringBuilder()
    val (n, m) = readln().split(" ").map { it.toInt() }
    val saveNum = mutableMapOf<String, Int>()
    val saveStr = mutableMapOf<Int, String>()

    for (i in 1..n) {
        saveStr[i] = readln()
        saveNum[saveStr[i]!!] = i
    }
    repeat(m) {
        var find = readln()
        if (isInt(find)) {
            sb.append(saveStr[find.toInt()]).append('\n')
        } else {
            sb.append(saveNum[find]).append('\n')
        }
    }
    print(sb)
}

fun isInt(str: String): Boolean {
    return try {
        str.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}