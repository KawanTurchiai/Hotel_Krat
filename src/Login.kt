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

fun erro() {
    println("ERRO!")
}
