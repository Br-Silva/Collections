fun main() {
    val pedidos = mapOf(Pair(1, 27.0), 2 to 38.0, 3 to 52.0)
    println(pedidos)

    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}



