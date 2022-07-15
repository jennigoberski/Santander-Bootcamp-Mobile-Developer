package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    //Named args: nome dos parâmetros explícito, a ordem nesse caso NÃO importa
    val digitalOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digitalOneBank.nome)
    println(digitalOneBank.numero)

    val banco2 =digitalOneBank.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
    print(banco2.info())
}