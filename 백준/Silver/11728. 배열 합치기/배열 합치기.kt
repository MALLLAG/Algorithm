import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().split(" ").toTypedArray()

    val n = input[0].toInt()
    val m = input[1].toInt()
    val size = n + m
    val result = IntArray(size)

    val arrayA = br.readLine().split(" ").toTypedArray()
    val arrayB = br.readLine().split(" ").toTypedArray()


    var idx = 0
    for (i in 0 until n) {
        result[idx++] = arrayA[i].toInt()
    }
    for (i in 0 until m) {
        result[idx++] = arrayB[i].toInt()
    }
    Arrays.sort(result)

    for (r in result) {
        bw.write("$r ")
    }

    bw.flush()
    bw.close()
}