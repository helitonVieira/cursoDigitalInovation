package one.curso.kotlin.testes

import one.curso.kotlin.enum.ClienteTipo

fun main() {


    /*ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    //problema para rodar o forEach */

    for (elemento in ClienteTipo.values()){
        println("ex:1 -  ${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("ex:2 -  ${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("ex:3 -  ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("ex:4 - ${pj.name} - ${pj.descricao}")
}