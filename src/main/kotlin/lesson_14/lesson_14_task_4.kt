package org.example.lesson_14

fun main() {

    val satelliteDeimos = Satellite("Фобос", false, false)
    val satellitePhobos = Satellite("Деймос", false, false)
    val satellitesOfMarsList = listOf(satelliteDeimos, satellitePhobos)

    val planetMars = Planet(
        "Марс",
        true,
        false,
        satellitesOfMarsList,
    ).run {
        println("Планета: $name")
        println("Ее спутники:")
        println(satellitesOfMarsList.joinToString { it.name })
    }
}

open class CelestialBody(
    val category: String,
    val name: String,
)

class Satellite(
    name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
) : CelestialBody(
    category = "Cпутник",
    name,
)

class Planet(
    name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
    val satellitesList: List<Satellite>
) : CelestialBody(
    category = "Планета",
    name,
)