package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    override val nome:String,
    override val cpf:String,
    val salario: BigDecimal,
    val horaTrabalho: Int
): Pessoa(nome, cpf) {
    abstract fun calcularImpostos();

}