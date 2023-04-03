package src.main.kotlin

class VegetarianDiet(
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
) : AbstractDiet() {

    init {
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