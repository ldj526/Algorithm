fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val budget = readLine().split(' ').map { it.toInt() }.sorted()
    val m = readLine().toInt()

    var right = budget[n - 1]
    var left = 0
    var pivot = 0

    while (right >= left) {
        pivot = (right + left) / 2
        var total = m
        for (b in budget) {
            total -= if (b > pivot) pivot else b
        }
        if (total >= 0) left = pivot + 1
        else right = pivot - 1
    }
    print(right)
}