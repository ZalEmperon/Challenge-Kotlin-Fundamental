package challenge.vbalok
import java.util.*
fun main () {
    val reader = Scanner(System.`in`)
    print("Masukan nilai panjang : ")
    val panjang = reader.nextDouble()
    print("Masukan nilai lebar : ")
    val lebar = reader.nextDouble()
    print("Masukan nilai Tinggi : ")
    val tinggi = reader.nextDouble()
    val volume : Double
    volume = balokvol(panjang, lebar, tinggi)
    val vba = String.format("%.2f", volume)
    println("======================================")
    println("Volume dari balok yang mempunyai panjang $panjang, lebar $lebar, tinggi $tinggi ini adalah adalah $vba")
    println("Tekan 1 untuk menghitung lagi")
    println("")
    when (reader.nextInt()){
        1 -> {
            challenge.menu.main()
        }
    }
}
fun balokvol (panjang: Double, lebar: Double, tinggi: Double): Double
{
    return panjang * lebar * tinggi
}