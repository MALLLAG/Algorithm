fun main() {
    val n = readln().toInt()
    var count = 1
    var lt = 1
    var rt = 2
    var sum = lt + rt

    // 10
    // 1 2 3 4 5 6
    while (rt <= (n + 1) / 2) {
        if (sum == n) {
            count++
            rt++
            sum += rt
        } else if (sum > n) {
            sum -= lt
            lt++
        } else {
            rt++
            sum += rt
        }
    }

    println(count)
}