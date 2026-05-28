// Write a Kotlin program to check whether a number is a palindrome or not.
fun main() {
    val num=121
    var res= num
    var rev = 0

    while (res != 0) {
        rev = rev * 10 + res % 10
        res /= 10
    }

    if (num == rev) {
        println("$num is a Palindrome")
    } else {
        println("$num is not a Palindrome")
    }
}
