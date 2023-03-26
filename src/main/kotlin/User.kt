package src.main.kotlin
class User constructor(
    private var name: String,
    private var email: String?,
    private var sex: String,
    private var age: Int,
    private var height: Float,
    private var weight: Float) {

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
        return when {
            bmi < 18.5 -> "Esta es una dieta para subir de peso"
            bmi < 25.0 && bmi > 18.5 -> "Esta es una dieta para mantener tu peso"
            bmi < 30.0 && bmi > 25.0 -> "Esta es una dieta para bajar de peso"
            else -> "Toma en cuenta el tamaño de tus porciones y haz ejercicio"
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
         return "Hola $name, tu IMC es ${getBMI()}. Por lo que estás clasificado como ${classifyBMI()}. ${recommendDiet()}."
    }

    public fun updateWeight(weight: Float) {
        this.weight = weight
    }
}