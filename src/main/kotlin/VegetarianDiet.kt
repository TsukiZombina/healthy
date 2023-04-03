package src.main.kotlin

class VegetarianDiet(
    _dietName: String,
    _dietDescriptionShort: String,
    _dietDescriptionLong: String,
    _dietType: String,
    _dietRestrictions: String,
    _dietCalories: Int,
    _dietProteins: Int,
    _dietCarbohydrates: Int,
    _dietFats: Int,
    _dietFiber: Int?,
    _dietSodium: Int?,
    _dietPotassium: Int?,
    _dietCholesterol: Int?,
    _dietSugars: Int?,
    _dietVitaminA: Int?,
    _dietVitaminC: Int?,
    _dietCalcium: Int?,
    _dietIron: Int?
) : AbstractDiet() {

    init {
        dietName = _dietName
        dietDescriptionShort = _dietDescriptionShort
        dietDescriptionLong = _dietDescriptionLong
        dietType = _dietType
        dietRestrictions = _dietRestrictions
        dietCalories = _dietCalories
        dietProteins = _dietProteins
        dietCarbohydrates = _dietCarbohydrates
        dietFats = _dietFats
        dietFiber = _dietFiber
        dietSodium = _dietSodium
        dietPotassium = _dietPotassium
        dietCholesterol = _dietCholesterol
        dietSugars = _dietSugars
        dietVitaminA = _dietVitaminA
        dietVitaminC = _dietVitaminC
        dietCalcium = _dietCalcium
        dietIron = _dietIron
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