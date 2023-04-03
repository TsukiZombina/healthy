package src.main.kotlin

class WeightGainDiet() : AbstractDiet() {

    init {
        dietName = "Dieta para aumentar de peso"
        dietDescriptionShort = "Alimentación para subir de peso"
        dietDescriptionLong = "Plan Semanal:\n- Lunes: Desayuno - Batido de plátano con mantequilla de maní, Avena con frutos secos | Almuerzo - Pechuga de pollo a la plancha con arroz y frijoles | Cena - Salmón a la parrilla con papas y brócoli asado.\n- Martes: Desayuno - Tostada con aguacate, huevo frito y tomate | Almuerzo - Ensalada de atún con aguacate, tomate y lechuga | Cena - Espagueti a la boloñesa con ensalada de espinacas.\n- Miércoles: Desayuno - Tazón de yogur con granola y frutas | Almuerzo - Hamburguesa con queso y papas fritas | Cena - Pollo al horno con ensalada de espinacas y batata.\n- Jueves: Desayuno - Batido de proteínas con plátano y mantequilla de maní | Almuerzo - Sándwich de pavo con queso y aguacate | Cena - Salmón al horno con arroz integral y espárragos.\n- Viernes: Desayuno - Panqueques con mantequilla de maní y plátano | Almuerzo - Pollo al curry con arroz y ensalada | Cena - Filete con puré de papas y espárragos asados.\n- Sábado: Desayuno - Huevos revueltos con jamón y tostadas | Almuerzo - Ensalada de pollo con aguacate, tomate y lechuga | Cena - Pescado al horno con puré de papas y brócoli asado.\n- Domingo: Desayuno - Tostadas francesas con jarabe de arce y tocino | Almuerzo - Sandwich de jamón y queso con ensalada | Cena - Pollo asado con patatas y ensalada de espinacas."
        dietType = "Aumento de peso"
        dietRestrictions = "Ninguna"
        dietCalories = 2500
        dietProteins = 100
        dietCarbohydrates = 300
        dietFats = 80
        dietFiber = 25        
        dietSodium = 2000
        dietPotassium = 3000
        dietCholesterol = 100
        dietSugars = 50
        dietVitaminA = 5000
        dietVitaminC = 1000
        dietCalcium = 800
        dietIron = 30
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