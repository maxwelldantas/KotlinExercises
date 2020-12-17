import java.util.*

fun main(args: Array<String>) {
    val a: Int
    val b: Int
    val c: Int
    val d: Int

    val ler = Scanner(System.`in`)
    a = ler.nextInt()
    b = ler.nextInt()
    c = ler.nextInt()
    d = ler.nextInt()
    val diferenca: Int = (a * b - c * d)

    println("DIFERENCA = $diferenca")
}