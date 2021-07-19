package one.digitalinnovation.digionebank

class Analista(
    nome:String,
    cpf:String,
    salario:Double,
    horaTrabalho:Int
): Funcionario(nome, cpf, salario, horaTrabalho) {
    override fun calcularImpostos() = salario *0.10


}
