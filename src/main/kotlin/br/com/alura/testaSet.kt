package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Bruno", "Nanna", "Maik", "Gustavo")
    val assistiramCursoKotlin: Set<String> = setOf("Bruno", "Nanna", "Lídia")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
//    println(assistiramAmbos)
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Jonis")
    assistiramAmbos.add("Jonis")
    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Bruno")
    println(assistiramList)
    println(assistiramList.toSet())
}