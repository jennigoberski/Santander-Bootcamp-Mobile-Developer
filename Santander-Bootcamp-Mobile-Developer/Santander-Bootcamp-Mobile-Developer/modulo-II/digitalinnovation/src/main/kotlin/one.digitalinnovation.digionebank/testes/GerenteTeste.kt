package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val gerente = Gerente(nome = "Michael Wazowski", cpf = "32434535436", salario = 2000.0, senha = "abc123")
    ImprimeRelatorioFuncionario.imprime(gerente)

    TesteAutenticao().autentica(gerente)
}