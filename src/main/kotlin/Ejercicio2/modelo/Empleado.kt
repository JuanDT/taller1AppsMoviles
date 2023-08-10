package Ejercicio2.modelo

class Empleado(
    nombre: String,
    documentoIdentidad: String,
    correoElectronico: String,
    val salario: Double,
    val dependencia: String,
    val empleadosSubordinados: MutableList<Any> = mutableListOf(),
    val cargo: Cargo
) : Persona(nombre, documentoIdentidad, correoElectronico)
