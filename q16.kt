// Write a Kotlin program to convert temperature: - Celsius to Fahrenheit - Fahrenheit to Celsius
fun celTofah(cel: Double): Double {
    return (cel * 9.0 / 5.0) + 32
}

fun fahTocel(fah: Double): Double {
    return (fah - 32) * 5.0 / 9.0
}

fun main() {
    val cel = 100.0
    println("$cel°C = ${celTofah(cel)}°F")
    val fah = 32.0
    println("$fah°F = ${fahTocel(fah)}°C")
}
