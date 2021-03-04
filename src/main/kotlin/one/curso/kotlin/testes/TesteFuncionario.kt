package one.curso.kotlin.testes

import one.curso.kotlin.Funcionario
import one.curso.kotlin.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa = Pessoa(nome = "Heliton",cpf="000.000.000-00")
    println(pessoa.nome)
    println(pessoa.cpf)
   // println(pessoa.Endereco().rua)

    val funcionario = Funcionario(
        nome = "Joao",
        cpf = "000.000.000.00",
        BigDecimal.valueOf(154.25))
                println (funcionario.nome)
                println (funcionario.cpf)
                println (funcionario.salario)
                println (pessoa.cpf)
}