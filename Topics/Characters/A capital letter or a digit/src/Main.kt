fun main() {
    // write your code here
    val char = readln().first().toChar()
    val charCap = char.isLetter() && char.isUpperCase()
    val digit1to9 = char.isDigit() && char.digitToInt() > 0 && char.digitToInt() < 10
    println(charCap || digit1to9)
}