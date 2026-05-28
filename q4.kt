// Write a program to reverse a given number using loops.
fun main() {
    var num = 12345
    var rev = 0

    while(num!=0) {
        val digit=num % 10
        rev=rev*10+digit
        num /=10
    }
    println("Reversed number: $rev")
}
