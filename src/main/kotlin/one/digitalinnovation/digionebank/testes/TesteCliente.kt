package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val robert = Cliente(
        "Campion Hunter",
        "12345787978",
        ClienteTipo.PF,
        "123456"
    )

    println(robert)

    TesteAutenticacao().autentica(robert)
}
