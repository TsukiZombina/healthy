package src.main.kotlin

class Gym {
    var gymName: String
    var gymDescription: String
    var gymAddress: String
    var gymPhone: String
    var gymEmail: String
    var gymWebsite: String
    var gymSchedule: String
    var gymPrice: String
    var gymType: String
    var gymServices: String
    var gymEquipment: String


constructor(
        gymName: String,
        gymDescription: String,
        gymAddress: String,
        gymPhone: String,
        gymEmail: String,
        gymWebsite: String,
        gymSchedule: String,
        gymPrice: String,
        gymType: String,
        gymServices: String,
        gymEquipment: String
    ) {
        this.gymName = gymName
        this.gymDescription = gymDescription
        this.gymAddress = gymAddress
        this.gymPhone = gymPhone
        this.gymEmail = gymEmail
        this.gymWebsite = gymWebsite
        this.gymSchedule = gymSchedule
        this.gymPrice = gymPrice
        this.gymType = gymType
        this.gymServices = gymServices
        this.gymEquipment = gymEquipment
    }
    fun showGym() {
        println("Nombre: $gymName")
        println("Descripción: $gymDescription")
        println("Dirección: $gymAddress")
        println("Teléfono: $gymPhone")
        println("Email: $gymEmail")
        println("Website: $gymWebsite")
        println("Horario: $gymSchedule")
        println("Precio: $gymPrice")
        println("Tipo: $gymType")
        println("Servicios: $gymServices")
        println("Equipo: $gymEquipment")
    }
}