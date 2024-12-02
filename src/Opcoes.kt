fun opcoes(nome: String) {
    println(
        "Selecione uma opção\n1. Cadastro \n2.Reservar Quarto  \n3. Reservar Auditório \n4. Calcular Garçons \n5. Calcular Buffet \n6. Escolher Combustível \n7. Calcular Manutenção de Ar-Condicionados \n8. Sair"
    )
    val opcao = readln().toIntOrNull()
    when (opcao) {
        1 -> cadastro(nome)
        2 -> reservarQuarto(nome)
        3 -> reservarAuditorio(nome)
        4 -> calcularGarcons(nome)
        5 -> calcularBuffet(nome)
        6 -> escolherCombustivel(nome)
        7 -> calcularManutencaoAr(nome)
        8 -> exit(nome)
        else -> {
            println("Opção inválida.")
            opcoes(nome)
        }
    }
}

fun exit(nome: String) {
    println("Muito obrigado e até logo, $nome.")
}
