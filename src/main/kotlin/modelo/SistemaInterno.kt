package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Welcome Aboard Captain")
        }
        else{
            println("You is a Lier! Bring Me My Captain")
        }

    }
}