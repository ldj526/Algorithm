fun main() {
    val arr = IntArray(30) { 0 }
    repeat(28) {
        val n = readln().toInt()
        arr[n - 1] = 1
    }
    val list = arrayListOf<Int>()
    for (i in 0 until 30) {
        if(arr[i] == 0) {
            list.add(i + 1)
        }
    }
    println(list[0])
    println(list[1])
}