// Write a Kotlin program to print the multiplication table of a given number. 
fun main() {
    val num = 5

    println("Multiplication table of $num:")
    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}
