package Ejercicio2.modelo

class Cliente(
    nombre: String,
    cedula: String,
    correoElectronico: String,
    val direccion: String,
    val telefono: String
) : Persona(nombre, cedula, correoElectronico)
