package Alura_Kotlin.JuniorWender.GitHub.modelo

import Alura_Kotlin.JuniorWender.GitHub.modelo.Conta

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor)
            this.saldo -= valor
    }

}