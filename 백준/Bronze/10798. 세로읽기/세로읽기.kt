import kotlin.math.max

fun main() {
    val sb = StringBuilder()
    val arr = Array(5) { "" }
    var lenMax = 0
    for (i in 0 until 5) {
        arr[i] = readln()
        lenMax = max(lenMax, arr[i].length)
    }
    for (i in 0 until lenMax) {
        for (j in 0 until 5) {
            if(arr[j].getOrNull(i) != null){
                sb.append(arr[j][i])
            }
        }
    }
    println(sb)
}