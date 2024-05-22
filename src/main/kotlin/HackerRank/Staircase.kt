package HackerRank

fun staircase(n: Int): Unit {
    // Write your code here
    for (i in 1..n) {
        for (j in 1..n) {
            if (j <= n - i) {
                print(" ")
            } else {
                print("#")
            }
        }
        println()
    }
}