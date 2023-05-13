class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        var a = 0
        var b = 0
        for (i in park.indices) {
            for (j in 0 until park[i].length) {
                if (park[i][j] == 'S') {
                    a = i
                    b = j
                }
            }
        }
        for (i in routes.indices) {
            val ansA = a
            val ansB = b
            when (routes[i][0]) {
                'E' -> for (j in 0 until routes[i][2] - '0') {
                    b++
                    if (b > park[0].length - 1 || park[a][b] == 'X') {
                        a = ansA
                        b = ansB
                        break
                    }
                }

                'S' -> for (j in 0 until routes[i][2] - '0') {
                    a++
                    if (a > park.size - 1 || park[a][b] == 'X') {
                        a = ansA
                        b = ansB
                        break
                    }
                }

                'W' -> for (j in 0 until routes[i][2] - '0') {
                    b--
                    if (b < 0 || park[a][b] == 'X') {
                        a = ansA
                        b = ansB
                        break
                    }
                }

                else -> for (j in 0 until routes[i][2] - '0') {
                    a--
                    if (a < 0 || b < 0 || park[a][b] == 'X') {
                        a = ansA
                        b = ansB
                        break
                    }
                }
            }
            answer[0] = a
            answer[1] = b
        }
        
        return answer
    }
}