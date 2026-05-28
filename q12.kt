// Write a program to swap two numbers: - Using a third variable - Without using a third variable
fun main() {
    // a)Using a third variable
    var a = 10
    var b = 20
    println("Before swap: a=$a, b=$b")
    val temp = a
    a = b
    b = temp
    println("After swap (with third variable): a=$a, b=$b")
    
    // b)Without a third variable
    var x = 10
    var y = 20
    println("Before swap: x=$x, y=$y")
    x = x + y
    y = x - y
    x = x - y
    println("After swap (without third variable): x=$x, y=$y")
}
