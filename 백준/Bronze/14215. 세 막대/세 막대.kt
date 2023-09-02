fun main() {
    val triangle = readln().split(' ').map { it.toInt() }.sorted().toMutableList()
    while (triangle[2] >= triangle[0] + triangle[1]) {
        triangle[2]--
    }
    println(triangle.sum())
}