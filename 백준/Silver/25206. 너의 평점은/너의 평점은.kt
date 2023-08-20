fun main() {
    var gradeSum = 0.0
    var sum = 0.0
    repeat(20) {
        val input = readln().split(' ').map { it }
        gradeSum += input[1].toDouble()
        when (input[2]) {
            "A+" -> {
                sum += input[1].toDouble() * 4.5
            }

            "A0" -> {
                sum += input[1].toDouble() * 4.0
            }

            "B+" -> {
                sum += input[1].toDouble() * 3.5
            }

            "B0" -> {
                sum += input[1].toDouble() * 3.0
            }

            "C+" -> {
                sum += input[1].toDouble() * 2.5
            }

            "C0" -> {
                sum += input[1].toDouble() * 2.0
            }

            "D+" -> {
                sum += input[1].toDouble() * 1.5
            }

            "D0" -> {
                sum += input[1].toDouble() * 1.0
            }

            "F" -> {
                sum += 0
            }

            "P" -> {
                gradeSum -= input[1].toDouble()
            }
        }
    }
    print(sum / gradeSum)
}