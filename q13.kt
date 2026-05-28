// Write a Kotlin function to calculate simple interest using input values.
fun si(p: Double, r: Double, t: Double): Double {
    return (p*r*t) / 100
}

fun main() {
    val principal = 5000.0
    val rate = 8.5
    val time = 3.0

    val si = si(principal, rate, time)
    println("Principal = ₹$principal")
    println("Rate = $rate%")
    println("Time = $time years")
    println("Simple Interest = ₹$si")
}
