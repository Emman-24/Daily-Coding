package HackerRank

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var hightCandle = candles.max()
    var sum = 0
    for (i in candles) {
        if (i == hightCandle) sum++
    }
    return sum
}