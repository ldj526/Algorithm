fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if (a + b + c == 180) {
        if (a == b && b == c) {
            print("Equilateral")
        } else if(a==b||b==c||c==a){
            print("Isosceles")
        } else {
            print("Scalene")
        }
    } else {
        print("Error")
    }
}