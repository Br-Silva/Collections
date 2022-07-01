package br.com.alura

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)

    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[5] = 83.0
    println(pedidos)
    pedidos.put(6, 99.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(7, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(7, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 52.0)
    println(pedidos)
}
