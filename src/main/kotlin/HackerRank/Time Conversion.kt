package HackerRank

fun timeConversion(s: String): String {
    // Write your code here
    var hour = s.substring(0, 2)
    var minute = s.substring(3, 5)
    var second = s.substring(6, 8)
    var ampm = s.substring(8, 10)

    return when (ampm) {
        "AM" -> {
            if (hour == "12") "00:${minute}:${second}"
            else "${hour}:${minute}:${second}"
        }

        "PM" -> {
            if (hour == "12") "12:${minute}:${second}"
            else "${hour.toInt() + 12}:${minute}:${second}"
        }

        else -> "Invalid input"
    }
}