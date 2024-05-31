package HackerRank

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    val dayOfProgrammer = StringBuilder("")
    val monthsDay = mapOf(
        1 to 31,
        2 to 28,
        3 to 31,
        4 to 30,
        5 to 31,
        6 to 30,
        7 to 31,
        8 to 31,
        9 to 30,
        10 to 31,
        11 to 30,
        12 to 31
    )

    when (year) {
        in 1700..1917 -> {
            if (yearIsLeapJulianCalendar(year)) {
                val calculate = calculateDayOfProgrammer(year, monthsDay, true)
                dayOfProgrammer.append(calculate)
            } else {
                val calculate = calculateDayOfProgrammer(year, monthsDay)
                dayOfProgrammer.append(calculate)
            }
        }
        1918 -> {
            dayOfProgrammer.append("26.09.1918")
        }
        in 1919..2700 -> {
            if (yearIsLeapGregorianCalendar(year)) {
                val calculate = calculateDayOfProgrammer(year, monthsDay, true)
                dayOfProgrammer.append(calculate)

            } else {
                val calculate = calculateDayOfProgrammer(year, monthsDay)
                dayOfProgrammer.append(calculate)
            }
        }
    }
    return dayOfProgrammer.toString()
}

fun calculateDayOfProgrammer(year: Int, monthsDay: Map<Int, Int>, isLeap: Boolean = false): String {
    val result = StringBuffer("")
    var sum = 0
    for (month in monthsDay) {
        sum += month.value
        if (sum > 256) {
            if (isLeap) {
                result.append(256 - (sum - month.value) - 1)
            } else {
                result.append(256 - (sum - month.value))
            }
            result.append(".")
            result.append("0" + month.key)
            result.append(".")
            result.append(year)
            break
        }
    }
    return result.toString()
}

fun yearIsLeapJulianCalendar(year: Int): Boolean {
    return year % 4 == 0
}

fun yearIsLeapGregorianCalendar(year: Int): Boolean {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
}
