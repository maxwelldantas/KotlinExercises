import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    input.useLocale(Locale.US)

    val vendorName = input.next()
    val fixedSalary = input.nextDouble()
    val vendorTotalSales = input.nextDouble()
    val vendorTotalReceive = fixedSalary + (vendorTotalSales * 0.15)

    println(String.format(Locale.US,"TOTAL = R$ %.2f", vendorTotalReceive))
}