package Alura_Kotlin.JuniorWender.GitHub.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var Endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}