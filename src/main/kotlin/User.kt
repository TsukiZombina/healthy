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
        private var diet: Diet? = null,
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
            bmi < 18.5 -> WeightGainDiet(
                "Dieta para aumentar de peso",
                "Alimentación para subir de peso",
                "Plan Semanal:\n- Lunes: Desayuno - Batido de plátano con mantequilla de maní, Avena con frutos secos | Almuerzo - Pechuga de pollo a la plancha con arroz y frijoles | Cena - Salmón a la parrilla con papas y brócoli asado.\n- Martes: Desayuno - Tostada con aguacate, huevo frito y tomate | Almuerzo - Ensalada de atún con aguacate, tomate y lechuga | Cena - Espagueti a la boloñesa con ensalada de espinacas.\n- Miércoles: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Hamburguesa con queso y papas fritas | Cena - Pollo al horno con ensalada de espinacas y batata.\n- Jueves: Desayuno - Batido de proteínas con plátano y mantequilla de maní | Almuerzo - Sándwich de pavo con queso y aguacate | Cena - Salmón al horno con arroz integral y espárragos.\n- Viernes: Desayuno - Panqueques con mantequilla de maní y plátano | Almuerzo - Pollo al curry con arroz y ensalada | Cena - Filete con puré de papas y espárragos asados.\n- Sábado: Desayuno - Huevos revueltos con jamón y tostadas | Almuerzo - Ensalada de pollo con aguacate, tomate y lechuga | Cena - Pescado al horno con puré de papas y brócoli asado.\n- Domingo: Desayuno - Tostadas francesas con jarabe de arce y tocino | Almuerzo - Sandwich de jamón y queso con ensalada | Cena - Pollo asado con patatas y ensalada de espinacas.",
                "Aumento de peso",
                "Ninguna",
                2500,
                100,
                300,
                80,
                25,
                2000,
                3000,
                100,
                50,
                5000,
                1000,
                800,
                30
            ).toString()
            bmi < 25.0 && bmi >= 18.5 -> WeightMaintenanceDiet(
                "Dieta para mantener el peso",
                "Alimentación para mantener el peso",
                "Plan Semanal:\n- Lunes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Salmón a la parrilla con ensalada de espinacas, tomate y pepino | Cena - Pollo a la parrilla con arroz integral y verduras al vapor.\n- Martes: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Carne asada con ensalada de espinacas y espárragos al vapor.\n- Miércoles: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Pechuga de pollo a la plancha con arroz integral y verduras asadas | Cena - Salmón a la parrilla con ensalada de espinacas, tomate y pepino.\n- Jueves: Desayuno - Huevos revueltos con espinacas y tomate | Almuerzo - Ensalada de pollo con lechuga, tomate y aguacate | Cena - Pollo al horno con batatas y ensalada de espinacas.\n- Viernes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Pescado al horno con arroz integral y espárragos al vapor.\n- Sábado: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Hamburguesa de pavo con lechuga, tomate y aguacate | Cena - Salmón a la parrilla con ensalada de espinacas, tomate y pepino.\n- Domingo: Desayuno - Panqueques con frutas y jarabe de arce | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Filete a la parrilla con puré de papas y espárragos al vapor.",
                "Mantenimiento de peso",
                "Ninguna",
                2000,
                80,
                250,
                60,
                20,
                1500,
                2500,
                70,
                30,
                4000,
                800,
                600,
                20
            ).toString()
            else -> WeightLossDiet(
                "Dieta para bajar de peso",
                "Alimentación para perder peso",
                "Plan Semanal:\n- Lunes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Salmón a la plancha con brócoli al vapor.\n- Martes: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Pechuga de pollo a la parrilla con arroz integral y verduras al vapor | Cena - Ensalada de salmón ahumado con espinacas, tomate y aguacate.\n- Miércoles: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Pollo a la parrilla con verduras asadas.\n- Jueves: Desayuno - Huevos revueltos con espinacas y tomate | Almuerzo - Pescado al horno con ensalada de espinacas, tomate y pepino | Cena - Berenjenas rellenas de carne molida con ensalada.\n- Viernes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Sándwich de pavo con lechuga, tomate y mostaza | Cena - Ensalada de pollo con espinacas, aguacate y tomate.\n- Sábado: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Salmón a la plancha con brócoli al vapor.\n- Domingo: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Berenjenas rellenas de carne molida con ensalada de espinacas.",
                "Pérdida de peso",
                "Ninguna",
                1500,
                60,
                200,
                50,
                20,
                1000,
                2000,
                50,
                10,
                3000,
                600,
                400,
                10
            ).toString()
        }
    }

    //returns a diet plan classification as a string (weightGainDiet, weightMaintainDiet or weightLossDiet) based on the user's BMI.
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
