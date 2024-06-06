package HackerRank

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    val n = arr.size
    val myArray = Array(n) { 0 }
    for (i in 0 until n) {
        val newIndex = (i + d) % n
        myArray[i] = arr[newIndex]
    }
    return myArray
}
