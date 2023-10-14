fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()
    val char = n.toCharArray()
    val sb = StringBuilder()
    char.sortDescending()
    var sum = 0
    for (i in char.indices) {
        val num = char[i] - '0'
        sum += num
        sb.append(num)
    }
    if (char[char.size - 1] != '0' || sum % 3 != 0) {
        print(-1)
        return
    }
    print(sb)

    br.close()
}