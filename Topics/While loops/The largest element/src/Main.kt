fun main() {
    var max = 0
    do {
        val n = readln().toInt()
        if (n > max) { max = n }
    } while (n != 0)
    print(max)
}

/*
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()

}
*/