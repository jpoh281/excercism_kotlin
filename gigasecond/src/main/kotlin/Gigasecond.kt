import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(private val beforeDateTime: LocalDateTime) {

    constructor(beforeDate: LocalDate) : this(LocalDateTime.of(beforeDate, LocalTime.MIN))

   private val gigaSecond : Long = 1000000000

    val date: LocalDateTime = beforeDateTime.plusSeconds(gigaSecond)
}
