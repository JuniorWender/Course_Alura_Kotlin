fun testaLacos() {
    for (i in 1..5) {

        val titular = "Junior $i"
        val numeroConta = 1234 + i
        var saldo = i + 10.0

        println("O titular da conta e o: $titular")
        println("Numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

        testaCondicoes(saldo)
    }
}