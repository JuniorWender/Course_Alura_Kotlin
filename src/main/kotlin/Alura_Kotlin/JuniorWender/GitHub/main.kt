import Alura_Kotlin.JuniorWender.GitHub.modelo.Endereco

fun main() {
    println("Bem vindo ao bytebank")

    val endereco = Endereco(logradouro = "Rua x", complemento = "teste", numero= 1000, cep = "00000-000")

    val enderecoNovo = Endereco(logradouro = "Rua y", complemento = "n/a", numero= 1000, cep = "00000-000")

    println(endereco)

    print(endereco.equals(enderecoNovo))

}