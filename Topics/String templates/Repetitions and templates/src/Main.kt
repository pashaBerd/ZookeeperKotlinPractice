fun main() {
    // write your code here
    val input = readln()
    val inputLength = input.length
    val inputMultiplied = input.repeat(inputLength)
    print("${input.length} repetitions of the word $input: $inputMultiplied")
}