package Ejercicio1

//1
fun divisionPorRestas(dividendo: Int, divisor: Int): Int {
    if (dividendo < divisor) {
        return 0
    } else {
        return 1 + divisionPorRestas(dividendo - divisor, divisor)
    }
}

fun main() {
    val dividendo = 12
    val divisor = 4
    val resultado = divisionPorRestas(dividendo, divisor)
    println("$dividendo / $divisor = $resultado")
}



