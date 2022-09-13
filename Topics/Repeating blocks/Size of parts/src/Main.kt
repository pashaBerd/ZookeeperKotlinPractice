fun main() {
    val n = readln().toInt()
    var perfectSum = 0
    var largeSum = 0
    var smallSum = 0

    repeat(n) {
        val number = readln().toInt()
        if (number == 0) { perfectSum++ } else if (number > 0) { largeSum++ } else if (number < 0) { smallSum++ }
    }
    print("$perfectSum $largeSum $smallSum")
}