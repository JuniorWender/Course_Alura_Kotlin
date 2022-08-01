fun main() {
    println("Bem vindo ao bytebank")
    val contaAlex = Conta(titular = "Alex" , numero= 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = Conta(titular = "Fran" , numero = 1001)
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

    if(contaAlex.transfere(valor = 10.00,contaFran )){
        println("Transferencia concluida com sucesso")
    }
    else{
        println("falha na transferencia")
    }

}

class Conta(var titular: String,val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo Insuficiente")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

}

fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> {
            println("Saldo da conta e positivo")
        }
        saldo == 0.0 -> {
            println("Saldo da conta e neutro")
        }
        else -> {
            println("Saldo da conta e negativo")
        }
    }
}

fun testaLacos() {
    for (i in 1..5) {

        val titular = "Junior $i"
        val numeroConta = 1234 + i
        var saldo = i + 10.0

        println("O titular da conta e o: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

//        testaCondicoes(saldo)
    }
}