// Write a Kotlin function to find the sum of all numbers from 1 to N.
fun sumrange(n:Int):Int{
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    val n = 10
    println("Sum(1 to $n) = ${sumrange(n)}")
}
