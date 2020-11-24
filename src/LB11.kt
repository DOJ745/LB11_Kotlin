import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*
import kotlin.math.sqrt

// Task 1

        // D (Task 1)
const val RANDOM_CONST:Int = 42

        // C (Task 3)
enum class Holidays(val Date: String){
    Christmas("25.12"),
    VictoryDay("09.05"),
    NewYear("01.01")
}

fun main(args: Array<String>) {

    /*val palindrome = "Dot saw I was Tod"
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
*/

    // Task 2

        // A
    val withoutTypeInt: Int = 34;
    val withoutTypeDouble: Double = 3.14;
    val withoutTypeStr: String = "1234";

    var wthTypeInt = 45;
    var wthTypeStr = "1234";
    var wthTypeDouble = 3.19;

        // B

    val byteType: Byte = 44;
    val byteToInt = byteType.toInt();
    val intToStr: String = byteToInt.toString();

        // C

    println("BYTE -  + $byteType");
    println("BYTE TO INT - $byteToInt");
    println("INT TO STRING - $intToStr");

        // D - watch in top of code

        // E

    /*var nullInt: Int? = null;
    var str = readLine();
    println(str);*/

    // Task 3

        // A
    fun sumOfDouble(vararg values: Double): Double {
        var sum: Double = 0.0
            for (n in values)
            sum += n
            return sum
    }

    println("Sum of double =  " + sumOfDouble(3.14, 5.55, 1.99))

        // B

    /*println("Enter email: ")
    val emailIn: String = readLine()!!
    println("Enter password: ")
    val passwordIn: String = readLine()!!

    fun isValid(email: String , password: String): Boolean {
        val emailReg = Regex(pattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")
        val passwordReg = Regex(pattern = "\\s")

        val matchedEmail = emailReg.containsMatchIn(email)
        val matchedPassword = !passwordReg.containsMatchIn(password)
        fun notNull(str: String): Boolean = str.isNotEmpty()

        val passwLength: Boolean = !(password.length < 6 || password.length > 12)

        return ( notNull(email) && notNull(password) ) && ( matchedEmail && matchedPassword )
                && passwLength
    }

    if (isValid(emailIn, passwordIn))
        println("Success registration!")
    else
        println("Failed registration!")*/

        // C

    fun isHoliday(date: String?): Boolean{
        var checkDate: Boolean = false
        var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        var dateObj: LocalDate? = null

        try{
            dateObj = LocalDate.parse(date, formatter)
            when {
                date.equals(null) -> {
                    print("Null catched!")
                }
                else -> {
                    var formattedDate = date!!.format(formatter)
                    var dayMonth = formattedDate.substring(0, 5)
                    when(dayMonth){
                        Holidays.Christmas.Date -> { println("It's holiday!")
                            checkDate = true }
                        Holidays.VictoryDay.Date -> { println("It's holiday!")
                            checkDate = true }
                        Holidays.NewYear.Date -> { println("It's holiday!")
                            checkDate = true }
                        else -> println("It's working day")
                    }
                }
            }
        }
        catch (e: DateTimeParseException){
            print("Wrong format!")
        }
        return checkDate
    }

    val testDate = isHoliday("25.12.2020")

        // D

    fun doOperation(a: Int, b: Int, operation: Char): Double {
        var result: Double = 0.0
        var a = a.toDouble()
        var b = b.toDouble()
        when(operation){
            '+' -> result = a + b
            '-' -> result = a - b
            '/' -> result = a / b
            '*' -> result = a * b
            '%' -> result = a % b
            else -> println("Wrong operation!")
        }
        return result
    }
    val operationResult = doOperation(15, 24, '/')
    println("Operation result - $operationResult")

        // E

    fun IntArray.indexOfMax(): Int?{
        var maxInd: Int = 0
        var maxElem: Int = 0
        var count: Int = 0
        if(this.isEmpty())
            return null

        for(elem in this){
            if (elem > this[maxInd])
                maxInd = this.indexOf(elem)
                maxElem = elem
        }

        for(elem in this){
            if(elem == maxElem)
            count++
        }
        if(count >= 2){
            return null
        }
        return maxInd
    }

    val testArr: IntArray = intArrayOf(1, 2, 5, 7, 10, 8, 10)
    println("Index of max - " + testArr.indexOfMax())

        // F

    fun String.coincidence(symbol: Char): Int{
        val regSymbol = Regex(pattern = "[$symbol+]").findAll(this)
        var result = 0
        for(matchedSymbol in regSymbol){
            result++
        }
        return result
    }

    val testStr = "asdbbbaaaa"
    println("Matches of symbol a - " + testStr.coincidence('a'))

    // Task 4

        // A

    fun factorialFor(n: Int): Double{
        var result = 1.0
        var i = n
        while(i > 0)
        {
            result *= i
            i--
        }
        return result
    }

    println("Factorial var 1 - " + factorialFor(5))

    fun factorialInd(n: Int): Double = if (n < 2) 1.0 else n * factorialInd(n - 1)

    println("Factorial var 2 - " + factorialInd(5))

        // B

    fun Int.isPrime(): Boolean{
        if (this < 2) return false
        for (i in 2..this - 1) {
            if (this % i == 0) return false
        }
        return true
    }

    fun addElement(arr: IntArray, element: Int): IntArray {
        val mutableArray = arr.toMutableList()
        mutableArray.add(element)
        return mutableArray.toIntArray()
    }


    fun primeNumbers(number: Int): IntArray{
        var tempArr = intArrayOf()
        var testNumber: Int = number
        for(i in 1 until number){
            if(i.isPrime()){
                tempArr = addElement(tempArr, i)
                println("Prime number = $i")
            }
        }
        return tempArr
    }

    val primeArr = primeNumbers(10000)
    var simpleList: ArrayList<Int> = arrayListOf()
    var simpleArr: IntArray = intArrayOf()

    println("Simple LIST:")
    for(i in 0..20){
        simpleList.add(primeArr[i])
        println(simpleList.get(i))
    }

    println("Simple ARRAY:")
    for(i in 20..30)
    {
        simpleArr = addElement(simpleArr, primeArr[i])
    }
    for(i in 0..simpleArr.lastIndex) println("Arr number - " + simpleArr[i])

    // Task 5

        // A
        // B
        // C
}