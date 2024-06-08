package HackerRank

fun pageCount(n: Int, p: Int): Int {
    val front = p / 2
    val back = (n / 2) - front
    return minOf(front, back)
}