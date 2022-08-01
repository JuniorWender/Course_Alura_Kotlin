fun main() {
    println("Bem vindo ao bytebank")
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0

    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao()}")

}