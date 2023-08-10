package Ejercicio2

import Ejercicio2.modelo.Cargo
import Ejercicio2.modelo.Cliente
import Ejercicio2.modelo.Empleado
import Ejercicio2.modelo.Empresa

fun main() {
    val cargoGerente = Cargo("Gerente", 1)
    val gerente = Empleado("Juan Pérez", "12345678", "juan@gamail.com", 5000.0, "Gerencia", mutableListOf(), cargoGerente)

    val cargoSupervisor = Cargo("Supervisor", 2)
    val supervisor = Empleado("Ana López", "98765432", "ana@gmail.com", 4000.0, "Ventas", mutableListOf(), cargoSupervisor)

    val empresa = Empresa("Mi Empresa S.A.", "123456789", "Calle Principal 123", mutableListOf(gerente, supervisor), mutableListOf())

    val cliente = Cliente("María García", "87654321", "maria@gmail.com", "Avenida edén", "3234234")
    empresa.clientes.add(cliente)

    println("Nómina total: ${empresa.calcularNominaTotal()}")
    println("Nómina en Ventas: ${empresa.calcularNominaPorDependencia("Ventas")}")
}



