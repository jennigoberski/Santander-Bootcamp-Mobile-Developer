package one.digitalinnovation.digionebank

enum class ClienteTipoEnum(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica")
    //Criar funções estáticas
    /*companion object {
        fun printDescricao() = ...
    }*/
}