package src.main.kotlin
class User
constructor(
        private var name: String,
        private var email: String?,
        private var sex: String,
        private var age: Int,
        private var height: Float,
        private var weight: Float,
        private var diet: Diet? = null
) {

    fun getBMI(): Float {
        return weight / (height * height)
    }

    fun classifyBMI(): String {
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> "Bajo de peso"
            bmi < 25.0 -> "Normal"
            bmi < 30.0 -> "Sobrepeso"
            else -> "Obeso"
        }
    }

    fun recommendDiet(): String {
        val bmi = getBMI()
        val diet =
                when {
                    bmi < 18.5 -> Diet.weightGainDiet
                    bmi < 25.0 && bmi >= 18.5 -> Diet.weightMaintainDiet
                    bmi < 30.0 && bmi >= 25.0 -> Diet.weightLossDiet
                    else -> Diet.weightLossDiet
                }
        return diet.toString()
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
        return "Hola $name, tu IMC es ${getBMI()}. Por lo que estás clasificado como ${classifyBMI()}. ${recommendDiet()}."
    }

    public fun updateWeight(weight: Float) {
        this.weight = weight
    }
}
