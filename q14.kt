// Write a Kotlin program to print all prime numbers from 1 to N.
fun primerange(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val n = 50
    print("Prime numbers from 1 to $n: ")
    for (i in 1..n) {
        if (primerange(i)) 
            print("$i ")
    }
    println()
}
