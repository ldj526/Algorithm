import java.util.StringTokenizer

fun main() {
    val input = getInput()
    solution(input).forEach {
        println(it.name)
    }
}

data class InputList(
    var name: String,
    var kor: Int,
    var eng: Int,
    var math: Int
)

fun getInput(): Array<InputList> {
    val n = readln().toInt()
    val list = Array(n) { InputList("", 0, 0, 0) }
    repeat(n) {
        val st = StringTokenizer(readln())
        list[it].name = st.nextToken()
        list[it].kor = st.nextToken().toInt()
        list[it].eng = st.nextToken().toInt()
        list[it].math = st.nextToken().toInt()
    }
    return list
}

fun solution(list: Array<InputList>): List<InputList> {
    return list.sortedWith(compareBy({ -it.kor }, { it.eng }, { -it.math }, { it.name }))
}