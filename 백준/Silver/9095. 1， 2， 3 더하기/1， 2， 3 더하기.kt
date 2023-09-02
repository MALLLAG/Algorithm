fun main() {
    val t = readln().toInt()
    val d = IntArray(11)

    //    d[4] = d[3] + d[2] + d[1]
    //    4
    //    1+1+1+1, 1+1+2, 1+2+1, 1+3
    //    2+1+1, 2+2
    //    3+1

    d[1] = 1
    d[2] = 2
    d[3] = 4

    repeat(t) {
        val n = readln().toInt()

        for (i in 4..n) {
            d[i] = d[i-3] + d[i-2] + d[i-1]
        }

        println(d[n])
    }
}