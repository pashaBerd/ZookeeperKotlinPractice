fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val valueToCompare = 20

    val ab = a + b == valueToCompare
    val ac = a + c == valueToCompare
    val bc = b + c == valueToCompare

    if (ab || ac || bc) {
        println("true")
    } else {
        println("false")
    }
}