import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val cnt = br.readLine().toInt()
    val table = Array(cnt) { IntArray(5) }
    var num = 0
    var num2 = 0
    for (i in 0 until cnt) {
        val str = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (j in 0..4) {
            table[i][j] = str[j].toInt()
        }
    }
    for (i in 0 until cnt) {
        val set: MutableSet<Int> = HashSet()
        for (j in 0..4) {
            for (k in 0 until cnt) {
                if (i == k) {
                    continue
                }
                if (table[i][j] == table[k][j]) {
                    set.add(k)
                }
            }
        }
        if (num2 < set.size) {
            num2 = set.size
            num = i + 1
        }
    }
    if (num == 0) {
        println(1)
    } else {
        println(num)
    }
}