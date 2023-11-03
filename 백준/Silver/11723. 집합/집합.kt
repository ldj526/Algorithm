fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val m = readLine().toInt()
    var s = ByteArray(21) { 0 }
    repeat(m) {
        val calc = readLine().split(' ').map { it }
        when (calc[0]) {
            "add" -> {
                s[calc[1].toInt()] = 1
            }

            "check" -> {
                bw.write(if (s[calc[1].toInt()] != 0.toByte()) "1\n" else "0\n")
            }

            "remove" -> {
                s[calc[1].toInt()] = 0
            }

            "toggle" -> {
                if (s[calc[1].toInt()] == 0.toByte()) s[calc[1].toInt()] = 1
                else s[calc[1].toInt()] = 0
            }

            "all" -> {
                s = ByteArray(21) { 1 }
            }

            "empty" -> {
                s = ByteArray(21) { 0 }
            }
        }
    }
    bw.close()
}
