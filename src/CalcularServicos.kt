fun calcularGarcons(nome: String) {
    println("Quantos convidados estarão presentes?")
    val numConvidados = readln().toInt()
    println("Qual a duração do evento em horas?")
    val duracaoEvento = readln().toInt()

    val garconsNecessarios = Math.ceil(numConvidados / 12.0).toInt() + duracaoEvento / 2
    val custoTotal = garconsNecessarios * 10.50 * duracaoEvento

    println("São necessários $garconsNecessarios garçons.")
    println("Custo: R$ ${"%.2f".format(custoTotal)}")
}

fun calcularBuffet(nome: String) {
    println("Quantos convidados estarão presentes?")
    val numConvidados = readln().toInt()

    val litrosCafe = numConvidados * 0.2
    val litrosAgua = numConvidados * 0.5
    val qtdSalgados = numConvidados * 7

    val custoCafe = litrosCafe * 0.80
    val custoAgua = litrosAgua * 0.40
    val custoSalgados = (qtdSalgados / 100.0) * 34

    val custoTotalBuffet = custoCafe + custoAgua + custoSalgados

    println("O evento precisará de $litrosCafe litros de café, $litrosAgua litros de água, $qtdSalgados salgados.")
    println("Custo do Buffet: R$ ${"%.2f".format(custoTotalBuffet)}")
}
