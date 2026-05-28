// Write a program to count the number of digits in a given integer. 
fun main() {
    var num = 145623
    var count = 0
    if (num == 0) {
        count = 1
    } else {
        while (num != 0) {
            num /= 10
            count++
        }
    }
    println("Number of digits: $count")
}
