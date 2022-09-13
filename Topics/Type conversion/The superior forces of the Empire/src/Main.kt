import java.util.Scanner

fun main() {
    // write your code here
    val input = Scanner(System.`in`)
    val galEmpireShips = input.nextLine().toInt()
    val rebelAllianceShips = input.nextLine().toInt()
    val difference = galEmpireShips / rebelAllianceShips
    println(difference)
}