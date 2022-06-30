package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Bruno")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Bruno",
        "Nanna",
        "Gustavo",
        "Maik",
        "Felipe"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Bruno? ${nomes.contains("Bruno")}")
    println("Tamanho da coleção ${nomes.size}")
}