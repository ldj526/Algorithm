fun main() {
    val input = getInput()
    solution(input).forEach {
        println("${it.first} ${it.second}")
    }
}

data class InputList(
    val arr: ArrayList<Pair<Int, String>>
)

fun getInput(): InputList {
    val n = readln().toInt()
    val arr = ArrayList<Pair<Int, String>>()
    repeat(n) {
        val str = readln().split(" ")
        arr.add(Pair(str[0].toInt(), str[1]))
    }
    return InputList(arr)
}

fun compare(arr: ArrayList<Pair<Int, String>>): List<Pair<Int, String>> {
    return arr.sortedBy { it.first }
}

fun solution(input: InputList): List<Pair<Int, String>> {
    return compare(input.arr)
}