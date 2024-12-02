fun cadastro(nome: String) {
    println("Deseja cadastrar novamente? (S ou N)")
    val opcao = readln().uppercase()
    if (opcao == "S") {
        println("Realizando cadastro...")
    } else {
        opcoes(nome)
    }
}
