import Alura_Kotlin.JuniorWender.GitHub.modelo.*

fun main() {
    println("Bem vindo ao bytebank")


    val alex = Cliente(nome = "alex", cpf= "" , senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex,numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex , numero = 1001)

    testaContasDiferentes()
    println("total de contas: ${Conta.total}")
}