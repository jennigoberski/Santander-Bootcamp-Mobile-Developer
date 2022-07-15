package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipoEnum,
    val senha: String
) : Pessoa(nome, cpf), Login {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo do cliente: $clienteTipo
        """.trimIndent()
}