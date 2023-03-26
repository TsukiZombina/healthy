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

    fun showDiet() {
        println("Nombre: $dietName")
        println("Descripción corta: $dietDescriptionShort")
        println("Descripción larga: $dietDescriptionLong")
        println("Tipo: $dietType")
        println("Restricciones: $dietRestrictions")
        println("Calorías: $dietCalories")
        println("Proteínas: $dietProteins")
        println("Carbohidratos: $dietCarbohydrates")
        println("Grasas: $dietFats")
        println("Fibra: $dietFiber")
        println("Sodio: $dietSodium")
        println("Potasio: $dietPotassium")
        println("Colesterol: $dietCholesterol")
        println("Azúcares: $dietSugars")
        println("Vitamina A: $dietVitaminA")
        println("Vitamina C: $dietVitaminC")
        println("Calcio: $dietCalcium")
        println("Hierro: $dietIron")
    }
}