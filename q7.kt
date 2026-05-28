// Write a Kotlin function to find the largest among three numbers. 
fun largestno(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) a
    else if (b >= a && b >= c) b
    else c
}
fun main() {
    val a = 45
    val b = 78
    val c = 23
    println("Largest: ${largestno(a, b, c)}")
}
