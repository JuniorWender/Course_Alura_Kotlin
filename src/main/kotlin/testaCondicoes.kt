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