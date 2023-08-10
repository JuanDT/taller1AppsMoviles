package Ejercicio2.modelo

class Cliente(
    nombre: String,
    cedula: String,
    correoElectronico: String,
    val direccionCorrespondencia: String,
    val telefono: String
) : Persona(nombre, cedula, correoElectronico)
