import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = 0
    while (scanner.hasNext()) {
        val n = scanner.next().toInt()
        if (n % 4 == 0 && n > max) { max = n }
    }
    println(max)
}