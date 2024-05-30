package HackerRank

fun gradingStudents(grades: Array<Int>): Array<Int> {
    var result: Array<Int> = emptyArray()
    for (grade in grades) {
        var resultNextMultipleofFive = nextMultipleOfFive(grade)
        when (grade) {
            in 38..100 -> {
                if (resultNextMultipleofFive - grade < 3) {
                    result += resultNextMultipleofFive
                } else {
                    result += grade
                }
            }

            else -> {
                result += grade
            }
        }
    }
    return result
}

fun nextMultipleOfFive(n: Int): Int {
    return n + (5 - n % 5)
}
