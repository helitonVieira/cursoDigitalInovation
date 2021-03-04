package one.curso.kotlin

class Pessoa {
    var nome: String = "Heliton Silva Vieira"
    var cpf: String = "064.847.146.33"
    private set

    inner class Endereco{
        var rua: String = "Rua Teste"
    }
}
fun main() {
    val pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)
}
