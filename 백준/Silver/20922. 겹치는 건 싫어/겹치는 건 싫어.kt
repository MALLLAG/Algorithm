fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    val count = IntArray(100001)
    var lt = 0
    var rt = 0
    var max = 0
    while (rt < n) {
        if (count[list[rt]] < k) {
            count[list[rt]]++
            max = maxOf(max, rt - lt + 1)
            rt++
        } else {
            while (count[list[rt]] >= k) {
                count[list[lt]]--
                lt++
            }
        }
    }
    print(max)
}