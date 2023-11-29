fun main() = with(System.`in`.bufferedReader()) {
    var (N, L) = readLine().split(' ').map { it.toInt() }
    val height = readLine().split(' ').map { it.toInt() }.sorted()
    for (i in height.indices) {
        if (L >= height[i]) {
            L++
        } else {
            print(L)
            return@with
        }
    }
    print(L)
}