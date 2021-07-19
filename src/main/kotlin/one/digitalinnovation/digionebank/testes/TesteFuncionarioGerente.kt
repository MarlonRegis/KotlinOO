package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val campion:Gerente= Gerente(
        "Campion Hunter",
        "12345787978",
        3500.00,
        40)
    ImprimeRelatorioFuncionario.imprime(campion)
}
