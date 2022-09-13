fun main() {
    val input = readln().toInt()
    println(
        if (input > 0) { "positive" } else if (input < 0) { "negative" } else { "zero" }
    )
}