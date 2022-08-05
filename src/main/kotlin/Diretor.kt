class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario + plr
        }
    
    // Pode também fazer por função assim:
//    override fun getBonificacao(): Double {
//        return super.getBonificacao() + salario + plr
//    }


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}