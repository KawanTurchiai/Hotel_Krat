var hotel = "Hotel Krat"

fun main() {
    println("Bem-vindo ao $hotel!")
    print("Qual o seu nome? ")
    var nome = readln()
    login(nome)
}

fun login(nome: String) {
    var tentativas = 0
    while (tentativas < 3) {
        if (vali(nome)) {
            opcoes(nome)
            return
        } else {
            erro()
            tentativas++
        }
    }
    println("Você excedeu o número de tentativas.")
}

fun vali(nome: String): Boolean {
    println("$nome, nos informe qual a senha?")
    val senha = readln().toIntOrNull()
    return senha == 2678
}

fun opcoes(nome: String) {
    println(
        "Selecione uma opção\n1. Reserva \n2. Cadastro \n3. Opção 3\n4. Opção 4\n5. Opção 5\n6. Sair"
    )
    var opcao = readln().toIntOrNull()
    when (opcao) {
        1 -> exit(nome)
        2 -> cadastro(nome)
        3 -> exit(nome)
        4 -> exit(nome)
        5 -> exit(nome)
        6 -> exit(nome)
        else -> {
            println("Opção inválida.")
            opcoes(nome)
        }
    }
}

fun exit(nome: String) {
    println("Muito obrigado e até logo, $nome.")
}

fun erro() {
    println("ERRO!")
}

fun cadastro(nome: String) {
    println("Deseja cadastrar novamente? (S ou N)")
    var opcao = readln()
    if (opcao.equals("S", ignoreCase = true)) {
        println("Realizando cadastro...")
    } else {
        opcoes(nome)
    }
}
