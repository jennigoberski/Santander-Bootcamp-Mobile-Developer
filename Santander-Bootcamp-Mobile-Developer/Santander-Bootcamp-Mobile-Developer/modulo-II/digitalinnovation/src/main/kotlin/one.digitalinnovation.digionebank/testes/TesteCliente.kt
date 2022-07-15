package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipoEnum

fun main() {
    val cliente = Cliente(
        nome = "Rodolfo",
        cpf = "34535465",
        clienteTipo = ClienteTipoEnum.PF,
        senha = "123456"
    )

    println(cliente)

    TesteAutenticao().autentica(cliente)
}