import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val dataDouble = scanner.nextDouble()
    val dataLong: Long = dataDouble.toLong()
    println(dataLong)
}