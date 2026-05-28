// Write a program to find the factorial of a number using a loop.
fun main() {
    val n = 6
    var fact = 1

    for (i in 1..n) {
        fact *= i
    }
    println("Factorial of $n = $fact")
}
