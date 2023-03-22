class User {
    name: String
    email: String
    sex: String
    age: Int
    height: Int
    weight: Int

    constructor(name: String, email: String, sex: String, age: Int, height: Int, weight: Int) {
        this.name = name
        this.email = email
        this.sex = sex
        this.age = age
        this.height = height
        this.weight = weight
    }

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
            bmi < 25.0 -> "Eat normally"
            bmi < 30.0 -> "Eat less"
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

    fun showRecommendation() {
        println("Hello $name, your BMI is $getBMI(). You are classified as $classifyBMI(). $recommendDiet().")
    }

    fun setWeight(weight: Int) {
        this.weight = weight
    }
    
    fun setHeight(height: Int) {
        this.height = height
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun setName(name: String) {
        this.name = name
    }
}