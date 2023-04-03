package src.main.kotlin

import kotlin.system.exitProcess

class Menu {
    private val mainGreeting = "Bienvenido a tu aplicación de salud Health"
    private val option1 = "1. Registrarse"
    private val optionFinal = "2. Salir"

    fun showMenu() {
        println(mainGreeting)
        println(option1)
        println(optionFinal)
    }

    fun menuSelection() {
        when (readln()) {
            "1" -> register()
            "2" -> exitProcess(0)
            else -> println("Opción inválida")
        }
    }

    private fun register() {
        println("Ingresa tu nombre")
        val name = readln()
        println("Ingresa tu correo electrónico (opcional)")
        val email = readlnOrNull()
        println("Ingresa tu edad (en años)")
        val age = readln().toInt()
        println("Ingresa tu peso (en kilogramos)")
        val weight = readln().toFloat()
        println("Ingresa tu altura (en metros)")
        val height = readln().toFloat()
        println("Ingresa tu género (M/F)")
        val sex = readln()
        val user1 = User(name, email, sex, age, height, weight)
        println(user1.showRecommendation())
    }
}
