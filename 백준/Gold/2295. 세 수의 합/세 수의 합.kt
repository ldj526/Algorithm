fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val list = ArrayList<Int>()
    for (i in 0 until n) {
        list.add(readln().toInt())
    }
    list.sort()
    val containTwo = ArrayList<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            containTwo.add(list[i] + list[j])
        }
    }
    containTwo.sort()
    val setContainTwo = ArrayList<Int>()
    for (i in 0 until containTwo.size){
        if(i==0 || containTwo[i] != containTwo[i-1]){
            setContainTwo.add(containTwo[i])
        }
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (binary(setContainTwo, list[i] - list[j])) {
                println(list[i])
                return
            }
        }
    }
}

fun binary(list: MutableList<Int>, num: Int): Boolean {
    var st = 0
    var en = list.size - 1
    while (st <= en) {
        val mid = (st + en) / 2
        if (list[mid] > num) en = mid - 1
        else if (list[mid] < num) st = mid + 1
        else return true
    }
    return false
}