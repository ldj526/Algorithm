fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var minPack = 1000
    var minEach = 1000
    repeat(m) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        if (minPack > a) minPack = a
        if (minEach > b) minEach = b
    }
    val allEach = minEach * n
    val allPack = ((n / 6) + 1) * minPack
    val mixed = (n / 6) * minPack + (n % 6) * minEach
    print(Math.min(Math.min(allEach, allPack), mixed))
}