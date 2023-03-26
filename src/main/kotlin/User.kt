package src.main.kotlin
class User constructor(
    private var name: String,
    private var email: String,
    private var sex: String,
    private var age: Int,
    private var height: Double,
    private var weight: Double) {

    fun getBMI(): Double {
        return weight / (height * height)
    }

    fun classifyBMI(): String {
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 25.0 -> "Normal"
            bmi < 30.0 -> "Overweight"
            else -> "Obese"
        }
    }

    fun recommendDiet(): String {
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> "Eat more"
            bmi < 25.0 && bmi > 18.5 -> "Eat normally"
            bmi < 30.0 && bmi > 25.0 -> "Eat less"
            else -> "Eat less and exercise more"
        }
    }

    fun showRecommendedGym(): String {
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> "Gym A"
            bmi < 25.0 -> "Gym B"
            bmi < 30.0 -> "Gym C"
            else -> "Gym D"
        }
    }

    fun showRecommendation(): String {
         return "Hello $name, your BMI is ${getBMI()}. You are classified as ${classifyBMI()}. ${recommendDiet()}."
    }

    public fun updateWeight(weight: Double) {
        this.weight = weight
    }
}