package Ejercicio2.modelo

class Empresa(
    val razonSocial: String,
    val nit: String,
    val direccion: String,
    val empleados: MutableList<Empleado> = mutableListOf(),
    val clientes: MutableList<Cliente> = mutableListOf()
) {
    fun calcularNominaTotal(): Double {
        return empleados.sumByDouble { it.salario }
    }

    fun calcularNominaPorDependencia(dependencia: String): Double {
        return empleados.filter { it.dependencia == dependencia }.sumByDouble { it.salario }
    }
}
