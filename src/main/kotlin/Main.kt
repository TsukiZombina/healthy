package src.main.kotlin

fun main() {
    val user1 = User("John Doe", "john.doe@example.com", "Male", 35, 1.75, 75.0)

    println(user1.showRecommendedGym()) // Gym B

    println(user1.classifyBMI()) // output: Normal
    user1.updateWeight(90.0)
    println(user1.classifyBMI()) // output: Underweight

    println(user1.showRecommendation())
}