package challenge.menu
import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println("======================================")
    println("Pilih bangunan yang ingin dihitung : ")
    println("1. Balok")
    println("2. Bola")
    println("3. Batal")
    println("======================================")
    println("Pilihanmu : ")
    when (reader.nextInt()) {
        1 -> {
            challenge.vbalok.main()
        }
        2 -> {
            challenge.vbola.main()
        }
        3 -> {

        }
    }
}