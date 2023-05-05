fun main() {
    val input = getInput()
    solution(input).forEach { map ->
        repeat(map.value) {
            print("${map.key} ")
        }
    }
}

data class InputList(
    val arr: List<Int>
)

fun getInput(): InputList {
    val (n, c) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }
    return InputList(arr)
}

fun compare(arr: List<Int>): Map<Int, Int> {
    val container = mutableMapOf<Int, Int>()
    arr.forEach {
        if (container.containsKey(it)) {
            container[it] = container[it]!! + 1
        } else {
            container[it] = 1
        }
    }
    return container
}

fun solution(input: InputList): Map<Int, Int> {
    return compare(input.arr).toList().sortedByDescending { it.second }.toMap()
}