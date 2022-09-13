import java.util.Scanner

fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val num1 = input.nextLine().toLong()
    val num2 = input.nextLine().toLong()

    val summary = num1+num2
    println(summary)
}