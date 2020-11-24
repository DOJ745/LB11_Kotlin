import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

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
        // E
        // F

    // Task 4

        // A
        // B

    // Task 5

        // A
        // B
        // C

}