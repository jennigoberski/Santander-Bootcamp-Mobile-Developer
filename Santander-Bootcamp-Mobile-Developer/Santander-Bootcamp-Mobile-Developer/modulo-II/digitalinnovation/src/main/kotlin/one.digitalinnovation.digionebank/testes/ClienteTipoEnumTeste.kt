package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipoEnum

fun main() {
    ClienteTipoEnum.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipoEnum.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val clientePf = ClienteTipoEnum.PF
    println(">> ${clientePf.name} - ${clientePf.descricao}")
}