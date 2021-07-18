package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Marlon"

    var cpf:String = "122.918.324-84"
    private set

    inner class Endereco{
        var rua = "Rua teste"
    }

    constructor()

    fun unirNomeCpf() = "Nome: $nome , CPF: $cpf"
}

fun main(){
    val marlon: Pessoa = Pessoa()

    println(marlon.nome)
    println(marlon.cpf)

    println(marlon.Endereco().rua)
    println(marlon.unirNomeCpf())
}