import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
    contaFran.deposita(valor = 300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex: ")
    contaAlex.deposita(valor = 50.0)
    println(contaAlex.saldo)
    println("Sacando na conta do Alex: ")
    contaAlex.saca(valor = 200.0)
    println(contaAlex.saldo)

    println()

    println("Depositando na conta da Fran: ")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)
    println("Sacando na conta da Fran: ")
    contaFran.saca(valor = 380.0)
    println(contaFran.saldo)

    if (contaAlex.transfere(valor = 10.00, contaFran)) {
        println("Transferencia concluida com sucesso")
    } else {
        println("falha na transferencia")
    }
}