// Write a function to check whether a character is a vowel or consonant.
fun checkVorC(ch: Char) {
    val low = ch.lowercaseChar()
    val vowels = "aeiou"

    if (low.isLetter()) {
        if (low in vowels) {
            println("'$ch' is a Vowel")
        } else {
            println("'$ch' is a Consonant")
        }
    } else {
        println("'$ch' is not a letter")
    }
}

fun main() {
    checkVorC('A')
    checkVorC('b')
}
