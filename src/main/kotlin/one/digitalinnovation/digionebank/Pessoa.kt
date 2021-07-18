package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Marlon"
    var cpf:String = "122.918.324-84"
}

fun main(){
    val marlon: Pessoa = Pessoa()

    println(marlon.nome)
    println(marlon.cpf)
}