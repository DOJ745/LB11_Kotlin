// Task 1
fun main(args: Array<String>){

    val palindrome = "Dot saw I was Tod"
    val len = palindrome.length
    val tempCharArray = CharArray(len)
    val charArray = CharArray(len)
    for (i in 0 until len) {
        tempCharArray[i] = palindrome[i]
    }
    for (j in 0 until len) {
        charArray[j] = tempCharArray[len - 1 - j]
    }
    val reversePalindrome = String(charArray)
    println(reversePalindrome)
}

    // Task 2

// A
// B
// C
// D
// E

    // Task 3

// A
// B
// C
// D
// E
// F

    // Task 4

// A
// B

    // Task 5

// A
// B
// C