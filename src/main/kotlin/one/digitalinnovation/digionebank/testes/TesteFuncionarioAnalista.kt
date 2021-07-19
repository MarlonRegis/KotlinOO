package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val marlon:Analista= Analista(
        "Jose Julio",
        "12345787978",
        2500.00,
        44)
    ImprimeRelatorioFuncionario.imprime(marlon)
}
