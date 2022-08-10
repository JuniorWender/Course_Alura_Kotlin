package Alura_Kotlin.JuniorWender.GitHub.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    // Pode também fazer por função assim:
//    override fun getBonificacao(): Double {
//        return super.getBonificacao() + salario + plr
//    }

}