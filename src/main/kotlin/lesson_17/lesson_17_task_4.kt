package org.example.lesson_17

fun main() {
    val packet = Packet(562455695, "Москва")

    packet.run {
        getNumberOfPacketMoves()
        packetCurrentLocation = "Уфа"
        getNumberOfPacketMoves()
    }
}

class Packet(
    val packetNumber: Long,
    _packetCurrentLocation: String,
) {
    var packetCurrentLocation = _packetCurrentLocation
        set(value) {
            field = value
            ++movementCounter
        }

    private var movementCounter: Int = 0

    fun getNumberOfPacketMoves() = println("Число перемещений: $movementCounter")
}