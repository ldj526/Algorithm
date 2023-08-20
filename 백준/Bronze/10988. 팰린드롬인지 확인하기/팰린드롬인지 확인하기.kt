fun main() {
    val str = readln()
    var st = 0
    var en = str.lastIndex
    var flag = true
    while (st <= en) {
        if (str[st] != str[en]) {
            flag = false
            break
        }
        st++
        en--
    }
    if (flag) {
        print(1)
    } else {
        print(0)
    }
}