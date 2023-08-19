import java.util.StringTokenizer

fun main() {
    val st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(n)
    repeat(m) {
        val st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()

        for (i in a - 1 until b) {
            arr[i] = c
        }
    }
    for (i in arr.indices){
        print("${arr[i]} ")
    }
}