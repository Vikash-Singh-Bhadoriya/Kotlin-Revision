import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    val formatDate = DateTimeFormatter.ofPattern("h:mm a")
    val hii = LocalTime.now().format(formatDate)

    println(LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d, y")))

}