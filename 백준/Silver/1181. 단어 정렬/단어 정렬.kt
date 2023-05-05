fun main() {
    val input = getInput()
    println(solution(input))
}

data class InputList(
    val arr: List<String>
)

fun getInput(): InputList {
    val n = readln().toInt()
    val arr = emptyList<String>().toMutableList()
    for (i in 0 until n) {
        arr.add(readln())
    }
    return InputList(arr)
}

fun compare(arr: List<String>): Set<String> {
    return arr.sortedWith(compareBy({ it.length }, { it })).toSet()
}

fun solution(input: InputList): String {
    return compare(input.arr).joinToString("\n")
}