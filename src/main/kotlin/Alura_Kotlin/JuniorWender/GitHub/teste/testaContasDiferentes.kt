import Alura_Kotlin.JuniorWender.GitHub.modelo.Cliente
import Alura_Kotlin.JuniorWender.GitHub.modelo.ContaCorrente
import Alura_Kotlin.JuniorWender.GitHub.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val alex = Cliente( "Alex" , "" , 2)

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val fran = Cliente( "Fran" , "", 1)

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo Corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")
    println("")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo Apos saque Corrente: ${contaCorrente.saldo}")
    println("saldo Apos saque poupanca: ${contaPoupanca.saldo}")
    println("")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo corrente apos transferir para poupanca: ${contaCorrente.saldo}")
    println("saldo poupanca apos receber transferencia: ${contaPoupanca.saldo}")
    println("")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("saldo corrente apos receber transferencia: ${contaCorrente.saldo}")
    println("saldo poupanca apos transferir para corrente: ${contaPoupanca.saldo}")
    println("")
}