package src.main.kotlin

class WeightLossDiet() : AbstractDiet() {

    init {
        dietName = "Dieta para bajar de peso"
        dietDescriptionShort = "Alimentación para perder peso"
        dietDescriptionLong = "Plan Semanal:\n- Lunes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Salmón a la plancha con brócoli al vapor.\n- Martes: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Pechuga de pollo a la parrilla con arroz integral y verduras al vapor | Cena - Ensalada de salmón ahumado con espinacas, tomate y aguacate.\n- Miércoles: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Pollo a la parrilla con verduras asadas.\n- Jueves: Desayuno - Huevos revueltos con espinacas y tomate | Almuerzo - Pescado al horno con ensalada de espinacas, tomate y pepino | Cena - Berenjenas rellenas de carne molida con ensalada.\n- Viernes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Sándwich de pavo con lechuga, tomate y mostaza | Cena - Ensalada de pollo con espinacas, aguacate y tomate.\n- Sábado: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Salmón a la plancha con brócoli al vapor.\n- Domingo: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Berenjenas rellenas de carne molida con ensalada de espinacas."
        dietType = "Pérdida de peso"
        dietRestrictions = "Ninguna"
        dietCalories = 1500
        dietProteins = 60
        dietCarbohydrates = 200
        dietFats = 50
        dietFiber = 20
        dietSodium = 1000
        dietPotassium = 2000
        dietCholesterol = 50
        dietSugars = 10
        dietVitaminA = 3000
        dietVitaminC = 600
        dietCalcium = 400
        dietIron = 10
    }

    override fun toString(): String {
        return "Nombre de la dieta: $dietName\n" +
                "Descripción corta: $dietDescriptionShort\n" +
                "Descripción larga: $dietDescriptionLong\n" +
                "Tipo de dieta: $dietType\n" +
                "Restricciones: $dietRestrictions\n" +
                "Calorías: $dietCalories\n" +
                "Proteínas: $dietProteins\n" +
                "Carbohidratos: $dietCarbohydrates\n" +
                "Grasas: $dietFats\n" +
                "Fibra: $dietFiber\n" +
                "Sodio: $dietSodium\n" +
                "Potasio: $dietPotassium\n" +
                "Colesterol: $dietCholesterol\n" +
                "Azúcares: $dietSugars\n" +
                "Vitamina A: $dietVitaminA\n" +
                "Vitamina C: $dietVitaminC\n" +
                "Calcio: $dietCalcium\n" +
                "Hierro: $dietIron"
    }
}