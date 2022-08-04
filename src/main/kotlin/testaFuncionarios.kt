fun testaFuncionarios() {
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4321,
        plr = 200.0
    )

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 2500.0
    )

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("Salario + bonificacao: ${gui.bonificacao}")

    println(" ")

    if (gui.autentica(4321))
        println("Autenticou com sucesso")
    else
        println("falha ao autenticar ")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificacao: ${calculadora.total}")
}