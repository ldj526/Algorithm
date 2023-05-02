import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val arr = IntArray(n) { br.readLine().toInt() }
    br.close()
    Arrays.sort(arr)
    arr.forEach {
        sb.append(it).append('\n')
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}