package one.curso.kotlin

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: Double
){
    /*fun deposito(valor:BigDecimal){
        print("$agencia $numero ${saldo.toString()}" )
    }
    fun saque(valor: BigDecimal) {
        print("$agencia $numero ${saldo.toString()}" )
    }*/

}
fun main(){
    var conta = Conta (agencia = "321", numero = "123", saldo = 254.00)
    println("Resultado: ${conta.agencia} ${conta.numero} ${conta.saldo.toString()}" )
}