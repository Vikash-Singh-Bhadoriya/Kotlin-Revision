import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.absoluteValue
import kotlin.math.sign
import kotlin.math.ulp
import kotlin.random.Random

fun main() {

//    println("12.5".toBigDecimal() * "1000".toBigDecimal())
//    val no = 55.55555555
//    val no2 = 55.5
//    val no3 = 532435.5
//    println(roundTo5DecimalPlace(no))
//    println(roundTo5DecimalPlace(no2))
//    println(roundTo5DecimalPlace(no3))

    val number1 = "154625626256"
    val number2 = "3525462546"
    val firstNumber = (if (number1.endsWith('.')) number1 + "0" else number1).toDouble()
    println(firstNumber)
    val secondNumber = (if (number2.endsWith('.')) number2 + "0" else number2).toDouble()
    println(secondNumber)

    val answer = firstNumber * secondNumber
    println(answer)
    if(answer.toString().contains('E')) {
        answer.toString()
        println("answer: $answer")
    }
    else if (answer.rem(1).absoluteValue.equals(0.0)) {
        println("answer.toInt(): ${answer.toInt()}")
        answer.toInt()
    } else {
        // decimal
        val df = DecimalFormat("#.######").apply {
            roundingMode = RoundingMode.CEILING
        }
        println( "df.format(answer): ${df.format(answer)}")
        df.format(answer)
    }

//    println((-25.0).rem(1))
//    println('+'.code)
//    println('-'.code)
//    println('×'.code)
//    println('÷'.code)
//    println(randomFloatBetween(3,5))
}

//fun randomFloatBetween(min: Int, max: Int): Float {
//    val float = Random.nextFloat()
//    println(float)
//    println(float * (max - min))
//    println(float * (max - min) + min)
//    return float * (max - min) + min
//}

//fun roundTo5DecimalPlace(num: Double): String {
//    var no = num.toString()
//    while (no.lastIndex -  no.indexOf('.') > 5) {
//        println("${no.lastIndex} - ${no.indexOf('.')} > 5")
//        no = no.dropLast(1)
//    }
//    return no
//}