package one.digitalinnovation.digionebank
//Tráfego de dados
data class Banco(
        val nome: String,
        val numero: Int
) {
    fun info() = "$nome --> $numero"
}