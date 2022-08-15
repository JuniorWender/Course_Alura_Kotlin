package Alura_Kotlin.JuniorWender.GitHub.modelo

import Alura_Kotlin.JuniorWender.GitHub.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){

        this.total += funcionario.bonificacao

    }

}