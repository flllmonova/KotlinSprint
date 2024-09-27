package org.example.lesson_15

fun main() {
    val transportation = Transportation()
    val passengersAmountForTransportation = 6
    val cargoWeightInTonsForTransportation = 2

    transportation.transportPassenger(passengersAmountForTransportation)
    transportation.transportCargo(cargoWeightInTonsForTransportation)
}

class Transportation {

    fun transportCargo(totalCargoWeight: Int) {
        val cargoCar = CargoCar(2, 1)
        val cargoCapacity = cargoCar.cargoCapacity

        val listOfCargoTransportation =
            if (totalCargoWeight <= cargoCapacity) listOf(totalCargoWeight)
            else MutableList(totalCargoWeight / cargoCapacity) { cargoCapacity }
                .also {
                    it.add(totalCargoWeight % cargoCapacity)
                    it.remove(0)
                }

        for (cargoWeight in listOfCargoTransportation) {
            with(cargoCar) {
                getToStartPoint()
                loadCargo(cargoWeight)
                startTrip()
                completeTrip()
                unloadCargo(cargoWeight)
            }
            println()
        }
    }

    fun transportPassenger(totalPassengersAmount: Int) {
        val passengerCar = PassengerCar(3)
        val passengerCapacity = passengerCar.passengerCapacity

        val listOfPassengerTransportation =
            if (totalPassengersAmount <= passengerCapacity) listOf(totalPassengersAmount)
            else MutableList(totalPassengersAmount / passengerCapacity) { passengerCapacity }
                .also {
                    it.add(totalPassengersAmount % passengerCapacity)
                    it.remove(0)
                }

        for (passengerAmount in listOfPassengerTransportation) {
            with(passengerCar) {
                getToStartPoint()
                loadPassenger(passengerAmount)
                startTrip()
                completeTrip()
                unloadPassenger(passengerAmount)
            }
            println()
        }
    }
}

abstract class Car(
    val category: String,
    val passengerCapacity: Int,
) : Movable {

    override fun getToStartPoint() {
        println("Для поездки выбран: $category")
        super.getToStartPoint()
    }
}

class PassengerCar(
    passengerCapacity: Int,
) : Car(
    category = "легковой автомобиль",
    passengerCapacity,
), PassengerTransportation

class CargoCar(
    val cargoCapacity: Int,
    passengerCapacity: Int,
) : Car(
    category = "грузовой автомобиль",
    passengerCapacity,
), PassengerTransportation, CargoTransportation

interface Movable {

    fun getToStartPoint() {
        println("Вы доехали до точки начала поездки")
    }

    fun startTrip() {
        println("Вы начали поездку")
    }

    fun completeTrip() {
        println("Вы приехали в место назначения")
    }
}

interface CargoTransportation {

    fun loadCargo(cargoWeight: Int) {
        println("Осуществляется загрузка $cargoWeight т. груза")
    }

    fun unloadCargo(cargoWeight: Int) {
        println("Осуществляется разгрузка $cargoWeight т. груза")
    }
}

interface PassengerTransportation {

    fun loadPassenger(passengersAmount: Int) {
        println("Осуществляется погрузка $passengersAmount пассажиров")
    }

    fun unloadPassenger(passengersAmount: Int) {
        println("Осуществляется выгрузка $passengersAmount пассажиров")
    }
}