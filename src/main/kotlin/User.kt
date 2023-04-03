package src.main.kotlin

/*This code defines a "User" class with several properties such as name,
 email, age, sex, height, weight, diet, and gym. It has several functions 
 to calculate the user's BMI (body mass index) and classify it according 
 to four categories. */

class User
constructor(
        private var name: String,
        private var email: String?,
        private var sex: String,
        private var age: Int,
        private var height: Float,
        private var weight: Float,
        private var diet: AbstractDiet? = null,
        private var gym: Gym? = null,
) {

    //Calculates the user's BMI (body mass index) based on the user's height and weight.
    private fun getBMI(): Float {
        return weight / (height * height)
    }

    //Classifies the user's BMI according to four categories: underweight, normal, overweight, and obese.
    private fun classifyBMI(): String {
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> "Bajo de peso"
            bmi < 25.0 -> "Normal"
            bmi < 30.0 -> "Sobrepeso"
            else -> "Obeso"
        }
    }

    //Recommends a specific diet plan based on the user's BMI. It does so by calling the appropriate constructor of one of the three Diet classes: WeightGainDiet, WeightMaintenanceDiet or WeightLossDiet.
    private fun recommendAbstractDiet(): String{
        val bmi = getBMI()
        return when {
            bmi < 18.5 -> WeightGainDiet().toString()
            bmi < 25.0 && bmi >= 18.5 -> WeightMaintenanceDiet().toString()
            else -> WeightLossDiet().toString()
        }
    }

    //Returns a gym plan classification as a string (gymForWeightGain, gymForWeightMaintain or gymForWeightLoss) based on the user's BMI.
    private fun recommendGym(): String {
        val bmi = getBMI()
        val gym =
            when {
                bmi < 18.5 -> Gym.gymForWeightGain
                bmi < 25.0 -> Gym.gymForWeightMaintain
                bmi < 30.0 -> Gym.gymForWeightLoss
                else -> Gym.gymForWeightLoss
            }
        return gym.toString()
    }

    //Returns a string that summarizes the user's BMI classification and the corresponding diet and gym recommendations.
    fun showRecommendation(): String {
        return "Hola $name, tu IMC es ${getBMI()}. Por lo que estás clasificado como ${classifyBMI()}. Por lo que te recomendamos la siguiente dieta:\n${recommendAbstractDiet()} \nTe aconsejamos visitar el siguiente Gym:\n ${recommendGym()}."
    }

    //Returns a string that summarizes the user's BMI classification and the corresponding diet and gym recommendations.
    public fun updateWeight(weight: Float) {
        this.weight = weight
    }
}
