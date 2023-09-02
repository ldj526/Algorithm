fun main() {
    while (true) {
        val triangle = readln().split(' ').map { it.toInt() }.sorted()
        if (triangle[0] == 0) break
        if (triangle[2] >= triangle[0] + triangle[1]) {
            println("Invalid")
        } else {
            when (triangle.groupBy { it }.size) {
                1 -> println("Equilateral")
                2 -> println("Isosceles")
                else -> println("Scalene")
            }
        }
    }
}