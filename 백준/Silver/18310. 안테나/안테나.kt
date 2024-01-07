fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val antenna = readLine().split(' ').map { it.toInt() }.sorted()
    print(antenna[(n - 1) / 2])
}