package one.curso.kotlin

class Pessoa {
    val nome: String = "Heliton Silva Vieira"
    val cpf: String = "064.847.146.33"
}
fun main() {
    val pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
}
