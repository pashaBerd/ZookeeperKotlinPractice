import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do {
        val item = scanner.next().toInt()
        sum += item
    } while (item != 0)

    println("$sum")
}