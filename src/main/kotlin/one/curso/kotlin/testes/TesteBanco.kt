package one.curso.kotlin

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2") //exemplo caso queira alterar um data class fazer uma copia

    println(banco2.info())

}