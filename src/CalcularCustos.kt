fun escolherCombustivel(nome: String) {
    println("Qual o valor do álcool no posto Wayne Oil?")
    val valorAlcoolWayne = readln().toDouble()
    println("Qual o valor da gasolina no posto Wayne Oil?")
    val valorGasolinaWayne = readln().toDouble()
    println("Qual o valor do álcool no posto Stark Petrol?")
    val valorAlcoolStark = readln().toDouble()
    println("Qual o valor da gasolina no posto Stark Petrol?")
    val valorGasolinaStark = readln().toDouble()

    val (custoWayne, combustivelWayne) = if (valorAlcoolWayne < 0.7 * valorGasolinaWayne) {
        Pair(valorAlcoolWayne * 42, "álcool")
    } else {
        Pair(valorGasolinaWayne * 42, "gasolina")
    }

    val (custoStark, combustivelStark) = if (valorAlcoolStark < 0.7 * valorGasolinaStark) {
        Pair(valorAlcoolStark * 42, "álcool")
    } else {
        Pair(valorGasolinaStark * 42, "gasolina")
    }

    if (custoWayne < custoStark) {
        println("É mais barato abastecer com $combustivelWayne no posto Wayne Oil.")
    } else {
        println("É mais barato abastecer com $combustivelStark no posto Stark Petrol.")
    }
}

fun calcularManutencaoAr(nome: String) {
    val orcamentos = mutableListOf<Pair<String, Double>>()

    while (true) {
        println("Qual o nome da empresa?")
        val nomeEmpresa = readln()
        println("Qual o valor por aparelho?")
        val valorPorAparelho = readln().toDouble()
        println("Qual a quantidade de aparelhos?")
        val qtdAparelhos = readln().toInt()
        println("Qual a porcentagem de desconto?")
        val desconto = readln().toDouble() / 100
        println("Qual o número mínimo de aparelhos para conseguir o desconto?")
        val qtdMinimaDesconto = readln().toInt()

        var custoTotal = valorPorAparelho * qtdAparelhos
        if (qtdAparelhos >= qtdMinimaDesconto) {
            custoTotal -= custoTotal * desconto
        }

        orcamentos.add(nomeEmpresa to custoTotal)
        println("O serviço de $nomeEmpresa custará R$ ${"%.2f".format(custoTotal)}")

        println("Deseja informar novos dados? (S/N)")
        val maisDados = readln().uppercase()
        if (maisDados == "N") break
    }

    val menorOrcamento = orcamentos.minByOrNull { it.second }
    println("O orçamento de menor valor é o de ${menorOrcamento?.first} por R$ ${"%.2f".format(menorOrcamento?.second)}")
}
