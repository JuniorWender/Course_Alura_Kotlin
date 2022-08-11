package Alura_Kotlin.JuniorWender.GitHub.teste

import Alura_Kotlin.JuniorWender.GitHub.modelo.Autenticavel
import Alura_Kotlin.JuniorWender.GitHub.modelo.SistemaInterno

// ---------------------------------------------------------------------------------------------------------------------

// Object Declaration: (Precisa ser Global)

object Contar {
    var total = 0
        private set
    fun incrementando(){
        total ++
    }
}
// ---------------------------------------------------------------------------------------------------------------------

// Companion Object: (Precisa ser Global e ESTAR em uma CLASSE)

//companion object Contando {
//    var total = 0
//        private set
//}

// ---------------------------------------------------------------------------------------------------------------------

fun testaObject() {

    // Object Expression:

    val fran = object : Autenticavel {
        val nome : String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    // Teste Object Expression:

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran,1000)

// ---------------------------------------------------------------------------------------------------------------------

    // Teste Object Declaration:

    Contar.incrementando()
    println("Valor Atual incrementado: ${Contar.incrementando()}")

// ---------------------------------------------------------------------------------------------------------------------

    // Teste Companion Object:

//    Contando.total++

}
