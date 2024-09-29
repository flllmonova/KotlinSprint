package org.example.lesson_16

class Order(
    val orderNumber: Long,
    var orderStatus: String,
) {

    fun changeOrderStatus(_status: String) {
        orderStatus = _status
    }
}

fun sendRequestToManager(newStatus: String, order: Order) {
    order.changeOrderStatus(newStatus)
}