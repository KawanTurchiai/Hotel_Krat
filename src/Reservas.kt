fun reserva(nome: String) {
    println("O que você gostaria de reservar?\n1. Quarto\n2. Auditório")
    val opcao = readln().toIntOrNull()

    if (opcao == 1) {
        reservarQuarto(nome)
    } else if (opcao == 2) {
        reservarAuditorio(nome)
    } else {
        println("Opção inválida. Tente novamente.")
        reserva(nome)
    }
}

fun reservarQuarto(nome: String) {
    while (true) {
        println("Qual o valor padrão da diária?")
        val valorDiaria = readln().toDouble()
        if (valorDiaria < 0) {
            println("Valor inválido, $nome")
            continue
        }

        println("Quantas diárias serão necessárias?")
        val dias = readln().toInt()
        if (dias < 0 || dias > 30) {
            println("Valor inválido, $nome")
            continue
        }

        val valorTotal = valorDiaria * dias
        println("O valor de $dias dias de hospedagem é de R$${"%.2f".format(valorTotal)}")

        println("Qual o nome do hóspede?")
        val nomeHospede = readln()

        println("Qual o quarto para reserva? (1 - 20)?")
        val quartoReserva = readln().toInt() - 1

        if (quartos[quartoReserva] != "livre") {
            println("Quarto está ocupado. Escolha outro.")
        } else {
            println("Quarto Livre.")
            println("$nome, você confirma a hospedagem para $nomeHospede por $dias dias para o quarto ${quartoReserva + 1} por R$${"%.2f".format(valorTotal)}? S/N")
            val confirmar = readln()
            if (confirmar.uppercase() == "S") {
                quartos[quartoReserva] = "ocupado"
                println("$nome, reserva efetuada para $nomeHospede.")
            } else {
                continue
            }
        }

        println("Lista de quartos e suas ocupações:")
        for (i in 0 until 20) {
            println("${i + 1} - ${quartos[i]}")
        }

        println("Deseja voltar ao menu inicial? S/N")
        val voltarMenu = readln().uppercase()
        if (voltarMenu == "S") {
            break // Sai do loop e volta ao menu principal
        }
    }
    opcoes(nome) // Chama o menu principal novamente
}

fun reservarAuditorio(nome: String) {
    while (true) {
        println("Qual o dia do evento? (sem acentos e letras minúsculas)")
        val diaSemana = readln()
        println("Qual a hora do evento?")
        val horaEvento = readln().toInt()

        val auditorioDisponivel = when (diaSemana) {
            "segunda", "terca", "quarta", "quinta", "sexta" -> horaEvento in 7..23
            "sabado", "domingo" -> horaEvento in 7..15
            else -> false
        }

        if (auditorioDisponivel) {
            println("Qual o nome da empresa?")
            val nomeEmpresa = readln()
            println("Auditório reservado para $nomeEmpresa: $diaSemana às ${horaEvento}hs.")
        } else {
            println("Auditório indisponível.")
            continue
        }

        println("Deseja voltar ao menu inicial? S/N")
        val voltarMenu = readln().uppercase()
        if (voltarMenu == "S") {
            break // Sai do loop e volta ao menu principal
        }
    }
    opcoes(nome) // Chama o menu principal novamente
}
