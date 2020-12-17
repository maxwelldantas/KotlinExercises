import java.util.*

fun main(args: Array<String>) {
    val number: Int
    val workedHours: Int
    val hourValue: Double

    val input = Scanner(System.`in`)
    input.useLocale(Locale.US)
    number = input.nextInt()
    workedHours = input.nextInt()
    hourValue = input.nextDouble()
    val employeeSalary: Double = (workedHours * hourValue)

    println("NUMBER = $number\n${String.format(Locale.US, "SALARY = U$ %.2f", employeeSalary)}")
}