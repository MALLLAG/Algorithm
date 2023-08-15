import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val builder = StringBuilder()
    val n = br.readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(br.readLine().toInt())
    }
    list.sort()

    for (i in list) {
        builder.append(i).append("\n")
    }

    println(builder)
}