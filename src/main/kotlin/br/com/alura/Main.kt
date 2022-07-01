import br.com.alura.testaMap

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 27.0),
        Pair(2, 68.0),
        3 to 52.0,
        4 to 70.0,
        5 to 102.0,
        6 to 90.0
    )
    //    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)
    val mensagem: Double? = pedidos.getOrElse(0, {
        0.0
    })
    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys){
        println("Pedido $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values){
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
}


