package src.main.kotlin

class WeightMaintenanceGym(): AbstractGym() {
    init {
        gymName = "Gym de crossfit"
        gymDescription = "Gimnasio enfocado en entrenamiento funcional de alta intensidad para mejorar la condición física"
        gymAddress = "Calle 3, #789, Colonia Condesa, Ciudad de México"
        gymPhone = "555-555-5555"
        gymEmail = "info@crossfitgym.com"
        gymWebsite = "www.crossfitgym.com"
        gymSchedule = "Lunes a viernes: 8:00am - 9:00pm, Sábado: 9:00am - 3:00pm"
        gymPrice = "$1500 MXN/mes"
        gymType = "Mantener peso"
        gymServices = "Entrenamiento funcional, entrenamiento de alta intensidad, entrenamiento en grupo, entrenamiento personalizado"
        gymEquipment = "Kettlebells, barras olímpicas, anillas, balones medicinales, cajas pliométricas, cuerdas de escalada, remoergómetros"
    }

    override fun toString(): String {
        return "Nombre: $gymName\n" +
                "Descripción: $gymDescription\n" +
                "Dirección: $gymAddress\n" +
                "Teléfono: $gymPhone\n" +
                "Email: $gymEmail\n" +
                "Website: $gymWebsite\n" +
                "Horario: $gymSchedule\n" +
                "Precio: $gymPrice\n" +
                "Tipo: $gymType\n" +
                "Servicios: $gymServices\n" +
                "Equipo: $gymEquipment\n"
    }
}