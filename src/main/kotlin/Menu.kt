package src.main.kotlin

class Menu {
    val mainGreeting = "Bienvenido a tu aplicación de salud Health"
    val option1 = "1. Registrarse"
    val optionFinal = "2. Salir"

    fun showMenu() {
        println(mainGreeting)
        println(option1)
        println(optionFinal)
    }

    fun menuSelection() {
        var option = readln()
        when (option) {
            "1" -> register()
            "2" -> System.exit(0)
            else -> println("Opción inválida")
        }
    }

    fun register() {
        println("Ingresa tu nombre");
        var name = readln();
        println("Ingresa tu correo electrónico (opcional)")
        var email = readlnOrNull();
        println("Ingresa tu edad (en años)");
        var age = readln().toInt();
        println("Ingresa tu peso (en kilogramos)");
        var weight = readln().toFloat()
        println("Ingresa tu altura (en metros)");
        var height = readln().toFloat()
        println("Ingresa tu género (M/F)")
        var sex = readln()
        val user1 = User(name, email, sex, age, height, weight);
        println(user1.showRecommendation())
    }
}