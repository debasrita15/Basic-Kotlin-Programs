//  Write a program to generate the Fibonacci series up to N terms using loops. 
fun main() {
    val n = 10
    var f0 = 0
    var f1 = 1
    print("Fibonacci series upto $n terms: ")
    for (i in 1..n) {
        print("$f0 ")
        val f2=f0+f1
        f0=f1
        f1=f2
    }
    println()
}
