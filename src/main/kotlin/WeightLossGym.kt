package src.main.kotlin

class WeightLossGym() : AbstractGym() {

    init {
        gymName = "Gym para bajar de peso"
        gymDescription = "Gimnasio enfocado en rutinas de cardio y entrenamiento funcional para bajar de peso"
        gymAddress = "Calle 1, #123, Colonia Centro, Ciudad de México"
        gymPhone = "555-123-4567"
        gymEmail = "info@gymweightloss.com"
        gymWebsite = "www.gymweightloss.com"
        gymSchedule = "Lunes a viernes: 6:00 am - 10:00 pm, Sábados: 8:00 am - 8:00 pm, Domingos: 10:00 am - 6:00 pm"
        gymPrice = "$1000 MXN al mes"
        gymType = "Bajar de peso"
        gymServices = "Rutinas de cardio, entrenamiento funcional, asesoría nutricional"
        gymEquipment = "Caminadoras, elípticas, bicicletas estáticas, TRX, pesas ligeras"
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