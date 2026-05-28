// Write a Kotlin program to find the sum of digits of a number.
fun main() {
    var num = 541
    var sum = 0

    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    println("Sum of digits: $sum")
}
