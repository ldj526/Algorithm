class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n, m), n * m / gcd(n, m))
    }
    
    fun gcd(n: Int, m: Int): Int {
        return if (m != 0) gcd(m, n % m) else n
    }
}