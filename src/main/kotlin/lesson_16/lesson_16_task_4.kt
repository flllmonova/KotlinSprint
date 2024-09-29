package org.example.lesson_16

class Order(
    val orderNumber: Long,
    var orderStatus: String,
) {

    private fun changeOrderStatus(_status: String) {
        orderStatus = _status
    }

    fun sendRequestToManager(newStatus: String) {
        changeOrderStatus(newStatus)
    }
}