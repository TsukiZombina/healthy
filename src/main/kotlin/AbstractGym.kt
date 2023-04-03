package src.main.kotlin

abstract class AbstractGym {
    var gymName: String = ""
    var gymDescription: String = ""
    var gymAddress: String = ""
    var gymPhone: String = ""
    var gymEmail: String = ""
    var gymWebsite: String = ""
    var gymSchedule: String = ""
    var gymPrice: String = ""
    var gymType: String = ""
    var gymServices: String = ""
    var gymEquipment: String = ""

    abstract override fun toString(): String
}