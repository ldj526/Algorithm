fun main() {
    val input = getInput()
    solution(input).forEach {
        println(it)
    }
}

data class InputList(
    val inputStr: String
)

fun getInput(): InputList {
    val str = readln()
    return InputList(str)
}

fun compare(str: String): List<String> {
    val list = ArrayList<String>()
    var n = 0
    while (n < str.length) {
        list.add(str.substring(n, str.length))
        n++
    }
    return list.sortedWith(compareBy { it })
}

fun solution(input: InputList): List<String> {
    return compare(input.inputStr).toMutableList()
}