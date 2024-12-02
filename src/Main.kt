// Main.kt
var hotel = "Hotel Krat"
val quartos = MutableList(20) { "livre" }

fun main() {
    println("Bem-vindo ao $hotel!")
    print("Qual o seu nome? ")
    val nome = readln()
    login(nome)
}
