fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 90.0),
        Pedido(3, 45.0),
        Pedido(4, 60.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])
    }

data class Pedido(val numero: Int, val valor: Double)

