package one.digitalinnovation.digionebank

class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    horaTrabalho:Int
): Funcionario(nome, cpf, salario, horaTrabalho) {
    override fun calcularImpostos() = salario * 0.15
}
