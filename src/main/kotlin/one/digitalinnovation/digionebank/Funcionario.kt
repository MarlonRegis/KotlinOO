package one.digitalinnovation.digionebank

abstract class Funcionario(
    override val nome:String,
    override val cpf:String,
    val salario: Double,
    val horaTrabalho: Int
): Pessoa(nome, cpf) {
    abstract fun calcularImpostos():Double;

    override fun toString():String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Jornada de trabalho: $horaTrabalho
        Imposto: ${calcularImpostos()}
        """.trimIndent()
}