package br.com.urionlinejudge

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    input.useLocale(Locale.US)

    val codPiece1 = input.nextInt()
    print(" ")
    val numPieces1 = input.nextInt()
    print(" ")
    val unitValue1 = input.nextDouble()
    println()
    val codPiece2 = input.nextInt()
    print(" ")
    val numPieces2 = input.nextInt()
    print(" ")
    val unitValue2 = input.nextDouble()
    val totalValuePaid = (numPieces1 * unitValue1) + (numPieces2 * unitValue2)

    println(String.format(Locale.US,"VALOR A SER PAGO: R$ %.2f", totalValuePaid))
}