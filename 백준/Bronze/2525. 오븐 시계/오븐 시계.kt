fun main(args: Array<String>) {
    var (h, m) = readln().split(" ").map { it.toInt() }
    val cookingTime = readln().toInt()

    if (m + cookingTime >= 60) {
        var plusHour = (m + cookingTime) / 60
        m = (m + cookingTime) % 60
        if (h + plusHour >= 24) {
            h = (h + plusHour) % 24
        } else {
            h += plusHour
        }
    } else {
        m += cookingTime
    }

    print("$h $m")
}