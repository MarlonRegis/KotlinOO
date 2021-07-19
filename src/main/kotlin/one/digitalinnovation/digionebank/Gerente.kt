package one.digitalinnovation.digionebank

class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    horaTrabalho:Int,
    val senha:String
): Funcionario(nome, cpf, salario, horaTrabalho), Logavel {
    override fun calcularImpostos() = salario * 0.15

    override fun login(): Boolean = "senha123" == senha
}
