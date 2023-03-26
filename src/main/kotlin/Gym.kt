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
    companion object{
        val gymForWeightLoss = Gym(
            "Gym para bajar de peso",
            "Gimnasio enfocado en rutinas de cardio y entrenamiento funcional para bajar de peso",
            "Calle 1, #123, Colonia Centro, Ciudad de México",
            "555-123-4567",
            "info@gymweightloss.com",
            "www.gymweightloss.com",
            "Lunes a viernes: 6:00 am - 10:00 pm, Sábados: 8:00 am - 8:00 pm, Domingos: 10:00 am - 6:00 pm",
            "$1000 MXN al mes",
            "Bajar de peso",
            "Rutinas de cardio, entrenamiento funcional, asesoría nutricional",
            "Caminadoras, elípticas, bicicletas estáticas, TRX, pesas ligeras"
        )

        val gymForWeightGain = Gym(
            "Gym para hacer pesas y subir de peso",
            "Gimnasio enfocado en rutinas de levantamiento de pesas y entrenamiento de fuerza para ganar masa muscular",
            "Calle 2, #456, Colonia Roma, Ciudad de México",
            "555-987-6543",
            "info@gymweightlifting.com",
            "www.gymweightlifting.com",
            "Lunes a viernes: 7:00 am - 10:00 pm, Sábados: 9:00 am - 7:00 pm, Domingos: Cerrado",
            "$1200 MXN al mes",
            "Subir de peso",
            "Rutinas de levantamiento de pesas, entrenamiento de fuerza, asesoría nutricional",
            "Máquinas de pesas, mancuernas, barras, discos, bancos"
        )

        val gymForWeightMaintain = Gym(
            "Gym de crossfit",
            "Gimnasio enfocado en entrenamiento funcional de alta intensidad para mejorar la condición física",
            "Calle 3, #789, Colonia Condesa, Ciudad de México",
            "555-555-5555",
            "info@crossfitgym.com",
            "www.crossfitgym.com",
            "Lunes a viernes: 8:00am - 9:00pm, Sábado: 9:00am - 3:00pm",
            "$1500 MXN/mes",
            "Mantener Peso",
            "Entrenamiento funcional, entrenamiento de alta intensidad, entrenamiento en grupo, entrenamiento personalizado",
            "Kettlebells, barras olímpicas, anillas, balones medicinales, cajas pliométricas, cuerdas de escalada, remoergómetros"
        )
    }
}
