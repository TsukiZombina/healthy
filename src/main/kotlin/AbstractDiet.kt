package src.main.kotlin

abstract class AbstractDiet {
    var dietName: String = ""
    var dietDescriptionShort: String = ""
    var dietDescriptionLong: String = ""
    var dietType: String = ""
    var dietRestrictions: String = ""
    var dietCalories: Int = 0
    var dietProteins: Int = 0
    var dietCarbohydrates: Int = 0
    var dietFats: Int = 0
    var dietFiber: Int? = null
    var dietSodium: Int? = null
    var dietPotassium: Int? = null
    var dietCholesterol: Int? = null
    var dietSugars: Int? = null
    var dietVitaminA: Int? = null
    var dietVitaminC: Int? = null
    var dietCalcium: Int? = null
    var dietIron: Int? = null

    abstract override fun toString(): String
}