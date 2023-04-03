package src.main.kotlin

class WeightMaintenanceDiet() : AbstractDiet() {

    init {
        dietName = "Dieta para mantener el peso"
        dietDescriptionShort = "Alimentación para mantener el peso"
        dietDescriptionLong = "Plan Semanal:\n- Lunes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Salmón a la parrilla con ensalada de espinacas, tomate y pepino | Cena - Pollo a la parrilla con arroz integral y verduras al vapor.\n- Martes: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Carne asada con ensalada de espinacas y espárragos al vapor.\n- Miércoles: Desayuno - Batido de proteínas con espinacas y plátano | Almuerzo - Pechuga de pollo a la plancha con arroz integral y verduras asadas | Cena - Salmón a la parrilla con ensalada de espinacas, tomate y pepino.\n- Jueves: Desayuno - Huevos revueltos con espinacas y tomate | Almuerzo - Ensalada de pollo con lechuga, tomate y aguacate | Cena - Pollo al horno con batatas y ensalada de espinacas.\n- Viernes: Desayuno - Tostada de aguacate con huevo y espinacas | Almuerzo - Ensalada de atún con lechuga, tomate y pepino | Cena - Pescado al horno con arroz integral y espárragos al vapor.\n- Sábado: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Hamburguesa de pavo con lechuga, tomate y aguacate | Cena - Salmón a la parrilla con ensalada de espinacas, tomate y pepino.\n- Domingo: Desayuno - Panqueques con frutas y jarabe de arce | Almuerzo - Ensalada de pollo con lechuga, tomate y pepino | Cena - Filete a la parrilla con puré de papas y espárragos al vapor."
        dietType = "Mantenimiento de peso"
        dietRestrictions = "Ninguna"
        dietCalories = 2000
        dietProteins = 80
        dietCarbohydrates = 250
        dietFats = 60
        dietFiber = 20
        dietSodium = 1500
        dietPotassium = 2500
        dietCholesterol = 70
        dietSugars = 30
        dietVitaminA = 4000
        dietVitaminC = 800
        dietCalcium = 600
        dietIron = 20
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