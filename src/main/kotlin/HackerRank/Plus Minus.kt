package HackerRank

fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0
    var negativeNumbers = 0
    var zeroNumber = 0
    val countArray = arr.size.toDouble()

    for (i in arr) {
        when {
            i > 0 -> positiveNumbers++
            i < 0 -> negativeNumbers++
            else -> zeroNumber++
        }
    }
    val positiveRadio = positiveNumbers / countArray
    val negativeRadio = negativeNumbers / countArray
    val zeroRadio = zeroNumber / countArray

    println(String.format("%.6f", positiveRadio))
    println(String.format("%.6f", negativeRadio))
    println(String.format("%.6f", zeroRadio))
}
