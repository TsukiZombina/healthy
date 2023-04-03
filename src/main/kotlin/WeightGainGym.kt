package src.main.kotlin

class WeightGainGym(): AbstractGym() {

    init {
        gymName = "Gym para hacer pesas y subir de peso"
        gymDescription = "Gimnasio enfocado en rutinas de levantamiento de pesas y entrenamiento de fuerza para ganar masa muscular"
        gymAddress = "Calle 2, #456, Colonia Roma, Ciudad de México"
        gymPhone = "555-987-6543"
        gymEmail = "info@gymweightlifting.com"
        gymWebsite = "www.gymweightlifting.com"
        gymSchedule = "Lunes a viernes: 7:00 am - 10:00 pm, Sábados: 9:00 am - 7:00 pm, Domingos: Cerrado"
        gymPrice = "$1200 MXN al mes"
        gymType = "Subir de peso"
        gymServices = "Rutinas de levantamiento de pesas, entrenamiento de fuerza, asesoría nutricional"
        gymEquipment = "Máquinas de pesas, mancuernas, barras, discos, bancos"
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