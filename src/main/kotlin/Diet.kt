package src.main.kotlin

class Diet {
    var dietName: String
    var dietDescriptionShort: String
    var dietDescriptionLong: String
    var dietType: String
    var dietRestrictions: String
    var dietCalories: Int
    var dietProteins: Int
    var dietCarbohydrates: Int
    var dietFats: Int
    var dietFiber: Int?
    var dietSodium: Int?
    var dietPotassium: Int?
    var dietCholesterol: Int?
    var dietSugars: Int?
    var dietVitaminA: Int?
    var dietVitaminC: Int?
    var dietCalcium: Int?
    var dietIron: Int?

    constructor(
        dietName: String,
        dietDescriptionShort: String,
        dietDescriptionLong: String,
        dietType: String,
        dietRestrictions: String,
        dietCalories: Int,
        dietProteins: Int,
        dietCarbohydrates: Int,
        dietFats: Int,
        dietFiber: Int?,
        dietSodium: Int?,
        dietPotassium: Int?,
        dietCholesterol: Int?,
        dietSugars: Int?,
        dietVitaminA: Int?,
        dietVitaminC: Int?,
        dietCalcium: Int?,
        dietIron: Int?
    ) {
        this.dietName = dietName
        this.dietDescriptionShort = dietDescriptionShort
        this.dietDescriptionLong = dietDescriptionLong
        this.dietType = dietType
        this.dietRestrictions = dietRestrictions
        this.dietCalories = dietCalories
        this.dietProteins = dietProteins
        this.dietCarbohydrates = dietCarbohydrates
        this.dietFats = dietFats
        this.dietFiber = dietFiber
        this.dietSodium = dietSodium
        this.dietPotassium = dietPotassium
        this.dietCholesterol = dietCholesterol
        this.dietSugars = dietSugars
        this.dietVitaminA = dietVitaminA
        this.dietVitaminC = dietVitaminC
        this.dietCalcium = dietCalcium
        this.dietIron = dietIron
    }

    override fun toString(): String {
        return "Nombre: $dietName\n" +
                "Descripción corta: $dietDescriptionShort\n" +
                "Descripción larga: $dietDescriptionLong\n" +
                "Tipo: $dietType\n" +
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
                "Hierro: $dietIron\n"
    }
    companion object {
        val weightGainDiet = Diet(
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
        )

        val weightMaintainDiet = Diet(
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
        )

        val weightLossDiet = Diet(
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
        )
    }
}

