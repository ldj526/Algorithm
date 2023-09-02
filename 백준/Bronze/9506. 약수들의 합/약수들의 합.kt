fun main() {
    while (true) {
        val a = readln().toInt()
        if (a == -1) break
        val sb = StringBuilder()
        var sum = 0
        for (i in 1 until a) {
            if (a % i == 0) {
                sum += i
                sb.append("$i + ")
            }
        }
        if (sum == a) {
            println("$a = ${sb.substring(0, sb.length - 3)}")
        } else {
            println("$a is NOT perfect.")
        }
    }
}