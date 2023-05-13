class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val playersMap = HashMap<String, Int>()
        for (i in 0 until players.size) {
            playersMap[players[i]] = i
        }
        for (i in 0 until callings.size) {
            val a = playersMap[callings[i]]!!.toInt()
            val cur = players[a]
            val before = players[a - 1]
            players[a] = players[a - 1].also { players[a - 1] = players[a] }
            playersMap[cur] = a - 1
            playersMap[before] = a
        }
        answer = players
        return answer
    }
}