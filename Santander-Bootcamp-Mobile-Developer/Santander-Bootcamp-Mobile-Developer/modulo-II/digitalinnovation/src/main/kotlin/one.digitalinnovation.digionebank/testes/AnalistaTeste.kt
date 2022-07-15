package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val funcionario = Analista(nome = "Cirilo", cpf = "123.456.789-0", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(funcionario)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())