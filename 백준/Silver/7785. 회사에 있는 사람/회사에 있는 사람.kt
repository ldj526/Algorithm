fun main() {
    val n = readln().toInt()
    val set = mutableSetOf<String>()
    repeat(n) {
        val str = readln().split(" ").map { it }
        if (str[1] == "enter") set.add(str[0])
        else set.remove(str[0])
    }
    val ans = set.sortedWith(compareByDescending { it })
    repeat(ans.size){
        println(ans[it])
    }
}