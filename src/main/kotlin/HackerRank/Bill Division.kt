package HackerRank

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val totalCost: Int = bill.filterIndexed { index, _ -> index != k }.sum()
    val anaShare = totalCost / 2
    if (anaShare == b) {
        println("Bon Appetit")
    } else {
        println(b - totalCost / 2)
    }
}
