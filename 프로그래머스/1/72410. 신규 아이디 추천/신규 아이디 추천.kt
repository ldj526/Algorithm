class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""
        answer = new_id.lowercase()
            .filter { it.isDigit() || it.isLowerCase() || it == '-' || it == '_' || it == '.' }
            .replace("[.]*[.]".toRegex(), ".")
            .removePrefix(".").removeSuffix(".")
            .ifEmpty { "a" }
            .let { if (it.length >= 16) it.substring(0, 15).removeSuffix(".") else it }
            .let {
                if (it.length <= 2) {
                    val sb = StringBuilder(it)
                    while (sb.length != 3)
                        sb.append(it.last())
                    sb.toString()
                } else it
            }
        return answer
    }
}