class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int // 0 Funcionario, 1 Gerente , 2 Diretor
) {
    fun bonificacao(): Double {
        return salario * 1.1
    }
}