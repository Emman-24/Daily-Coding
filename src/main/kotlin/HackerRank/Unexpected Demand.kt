package HackerRank

fun filledOrders(order: Array<Int>, k: Int): Int {
    val sortedOrders = order.sortedArray()

    var remainingResources = k
    var filledOrderCounts = 0

    for (o in sortedOrders) {
        if (remainingResources >= o) {
            remainingResources -= o
            filledOrderCounts++
        } else {
            break
        }
    }
    return filledOrderCounts
}