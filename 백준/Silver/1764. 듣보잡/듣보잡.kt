fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val neverHeard = HashSet<String>()
    val neverHeardSeen = mutableListOf<String>()
    repeat(n) {
        neverHeard.add(readLine())
    }
    repeat(m) {
        val str = readLine()
        if(neverHeard.contains(str)) neverHeardSeen.add(str)
    }
    sb.appendLine(neverHeardSeen.size)
    neverHeardSeen.sorted().forEach {
        sb.appendLine(it)
    }
    bw.write(sb.toString())
    bw.close()
}