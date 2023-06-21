//infix fun Int.pow(no: Int): Int {
//    var result = 1
//    var i = 0
//    while (i < no) {
//        result *= this
//        i++
//    }
//    return result
//}

//infix fun String.greetingFromCountry(country: String) {
//    when (country.lowercase()) {
//        "russia" -> print("privet")
//        "india" -> print("namaste")
//        "germany" -> print("halo")
//        "usa" -> print("hello")
//        else -> print("I don't know that")
//    }
//    print(" $this")
//}

//fun printLines(no: Int) {
//    (1..no).forEach{
//        println("$it Line")
//    }
//}

//infix fun Int.pow(exponent: Int): Int {
//    var result = 1
//    for (i in 1..exponent) {
//        result *= this
//    }
//    return result
//}

//fun sumFrom1To(n: Int): Int {
//    var sum = 0
//    for (i in 1..n) {
//        sum += i
//    }
//    return sum
//}
//
//
//fun personBio(person: Person): String {
//    return "Hii, I am ${person.name}. And I am ${person.age} years old"
//}
//
//fun primeNumberFrom1To(no: Int): List<Int> {
//    val primeNumbers = mutableListOf<Int>()
//    for (i in 2..no) {
//        var isPrime = true
//        for (j in 2..i.dec()) {
//            if (i % j == 0) {
//                isPrime = false
//                break
//            }
//        }
//        if (isPrime)
//            primeNumbers.add(i)
//    }
//    return primeNumbers
//}
//
////fun greet(name: String): String {
////    return "Hello $name"
////}
//

//fun greet(name: String) = "Hello $name"
//fun multiply(a: Int, b: Int) = a*b

//object Constants {
//    val
//}

//fun findFirstIndexOf(e: Int, list: List<Int>): Int {
//    for (index in list.indices) {
//        if (list[index] == e) {
//            return index
//        }
//    }
//    list.forEachIndexed { index, i ->
//        if (i == e) {
//            return index
//        }
//    }
//    return -1
//}

//fun printMyself(
//    name: String = "a Random Person",
//    age: Int = 18,
//    profession: String = "Coder"
//) =
//    println("Hello, I am $name.\nMy age is $age\nI am a $profession")

//fun findAllEvenNo(list: List<Int>): List<Int> {
//    return list.filter {
//        it % 2 == 0
//    }
//}

//fun findAllEvenNo(vararg numbers: Int, str: String): List<Int> {
//    return numbers.filter {
//        it % 2 == 0
//    }
//}

//fun getMax(vararg numbers: Int): Int? {
//    var max = if (numbers.isNotEmpty()) numbers[0] else return null
//    for (i in numbers) {
//        if (i > max) max = i
//    }
//    return max
//}

//fun search(query: String, browser: String = "Google", isSatisfiedFromResult: Boolean) {
//    println("Searching $query from $browser & I am ${if (isSatisfiedFromResult) "satisfied" else "not satisfied"} from the result")
//}

//fun alternatingSum(vararg numbers: Int): Int {
//    var result = 0
//    for (i in numbers.indices) {
//        if (i % 2 == 0) result += numbers[i] else result -= numbers[i]
//    }
//    return result
//}

//data class Person(
//    private val id: Int,
//    val name: String,
//    val age: Int,
//) {
//    fun greet() = println("Hello, I am $name, & I am $age years old")
//}
//
//fun Person.bio() {
//    println("name: $name\nage: $age")
//}
//
//fun diffBio(person: Person?) {
//    person?.let {
//        println("name: ${it.name}\nage: ${it.age}")
//    }
//}

//fun hii(name: String, printGreeting: (String) -> Unit) {
//    printGreeting("Hello $name")
//}
//
//fun greet(str: String) {
//    println(str)
//}

//fun Int.pow(no: Int): Int {
//    var result = 1
//    var i = 0
//    while (i < no) {
//        result *= this
//        i++
//    }
//    return result
//}

//fun Int.isPrime(): Boolean {
//    for (j in 2..this.dec()) {
//        if (this % j == 0) {
//            return false
//        }
//    }
//    return true
//}

//fun List<Int>.product(): Int? {
//    var product = if (this.isNotEmpty()) this[0] else return null
//    for (i in 1..this.lastIndex) {
//        product *= this[i]
//    }
//    return product
//}

//fun House.copy(
//    rooms: Int = this.rooms,
//    color: String = this.color,
//    cost: Double = this.cost
//) = House(rooms, color, cost)


//data class Laptop(
//    val processor: String,
//    val ram: Int,
//    val laptopCost: Double,
//    val userHouse: House
//) {
//    override fun toString() =
//        "This Laptop has $processor processor. It's has $ram gb ram. And It laptopCost $$laptopCost"
//
//    fun classifyLaptop(): String {
//        return if (ram >= 8 && laptopCost > 615.0) {
//            "Decent Laptop"
//        } else "Potato Laptop"
//    }
//}

//data class Person(val name: String, val age: Int = 0)

//class Shape(
//    val name: String,
//    val sides: Int,
//    val color: String
//) {
//    init {
//        println("Shape init 1 is initialized")
//        println("INIT 1 => Shape name is $name, have $sides sides & is in $color color")
//    }
//
//    val vertex = "Vertex: $sides".also(::println)
//    var diagonal = 0
//    var area = 0
//    var perimeter = 0
//
//    init {
//        println("Shape init 2 is initialized")
//    }
//
//    fun getDetail() = println("INIT 1 => Shape name is $name, have $sides sides & is in $color color")
//}

//class ColorDialog {
//    inline operator fun invoke(
//        color: String = "White",
//        onColorChange: (String) -> Unit = {
//            println(it)
//        }
//    ) {
//        println("color is $color")
//        val newColor = "Yellow"
//        onColorChange(newColor)
//    }
//
//    companion object {
//       var hello = "hello"
//    }
//}
//
//object Friends {
//    val name: List<String> = listOf("adfg", "Frfg", "A4rtdfg")
//}

//inline fun stringPlus((String, String) -> String) = String::plus
//inline fun stringPlus(a: String, b: String): String = a + b


abstract class Human {
    abstract val name: String

    abstract fun work()
}

open class Person(
    private val id: Int,
    override val name: String,
    open val age: Int,
) : Human() {
    open var no: Int = 3

    private fun uniqueName() = "$id$age"
    open fun greet() = println("Hello, I am $name, & I am $age years old")
    override fun work() {
        println("I am working")
    }
}

class Developer(
    id: Int,
    name: String,
    override var age: Int,
    val techStack: List<String>
) : Person(id, name, age) {

    override var no: Int = 3
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    override fun greet() = println("writing coding using ${techStack.joinToString()}")
}


//class Person(
//    private val id: Int,
//    val name: String,
//    val age: Int,
//) {
//    fun greet() = println("Hello, I am $name, & I am $age years old")

//    override fun hashCode(): Int {
//        return Objects.hash(name, age)
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other == null) return false
//        return other.hashCode() == this.hashCode()
//    }
//}

class House(
    val rooms: Int,
    val color: String,
    val cost: Double
) {
    lateinit var owner: String
    override fun toString() = "This house has $rooms rooms. It's color is $color. And It cost $$cost"

    fun classifyHouse(): String {
        return if (rooms >= 3 && cost > 1000.0) {
            "Quite Good"
        } else "You are living in a shit"
    }
}

//object Constants {
//    const val
//}

//class EmptyTitleException(message: String) : Exception(message)
//
//@Throws(EmptyTitleException::class)
//fun saveNote(title: String, description: String): String {
//    if (title.isNotBlank())
//        return "Note saved with title \"$title\" and description \"$description\""
//    else
//        throw EmptyTitleException("title cannot be empty")
//}

//fun <T> swapIndex(list: List<T>, index1: Int, index2: Int): List<T> {
//    val mutableList = list.toMutableList()
//    val index1Value = list[index1]
//    mutableList[index1] = list[index2]
//    mutableList[index2] = index1Value
//    return mutableList
//}

//class Box<T>(t: T)

//sealed class Drinks(glass: Int) {
//    class MangoShake(val glass: Int, val noOfMango: Int) : Drinks(glass)
//    class BananaShake(glass: Int) : Drinks(glass)
//}

//fun <T: Number, T2> List<T>.numberMap(map: (T) -> T2): List<T2> {
//    val list = mutableListOf<T2>()
//    this.forEach { e ->
//        list.add(map(e))
//    }
//    return list
//}

//data class CustomTriple<A : Any, B : Any, C : Any>(
//    var first: A,
//    var second: B,
//    var third: C
//) {
//    override fun toString(): String {
//        return "Triple first is $first, second is $second & third is $third"
//    }
//
//    fun printTypes() {
//        println("first type is ${first::class.simpleName}")
//        println("second type is ${second::class.qualifiedName}")
//        println("third type is ${third.javaClass.simpleName}")
//    }
//
//    fun toList() = listOf(first, second, third)
//}

//fun <T: Number> List<T>.customSum(filter: (T) -> Boolean): List<T> {
//    for()
//}

//fun List<Int>.customSum(filter: (Int) -> Boolean): Int {
//    var sum = 0
//    for (item in this) {
//        if (filter(item)) sum += item
//    }
//    return sum
//}

//@Suppress("UNCHECKED_CAST")
//fun <T : Number> List<T>.customSum(filter: (T) -> Boolean): T {
//    var sum = 0.0
//    for (item in this) {
//        if (filter(item)) {
//            sum += item.toDouble()
//        }
//    }
//    return sum as T
//}

fun main() {

//    println((1..10).toList().customSum { it % 2 == 1 })
//    println(listOf(45.45, 453.67, 346.457, 457.56).customSum { it in 100.0..500.0 })
//    println(listOf<Byte>(3, 43, 5, 4, 5, 5).customSum { it % 2 == 0 })
//    println(listOf<Char>('a', 'V', 'i', '%', 'b', 'W').map { it.code }.customSum { it % 2 == 0 })

//    val triple = CustomTriple(2, true, 4.3)
//    println(triple.first)
//    println(triple.second)
//    println(triple.third)
//    triple.printTypes()
//    println(triple)
//    Triple(3, 3, 3).

//    val list = listOf(34,56,35,56,65,90)
//    println(list.numberMap {
//        it.toChar()
//    }.joinToString())

//    val house = House(3,"FD",34.0)
//    println(house)
//    house.owner = "Vikash"
//    println(house.owner)

//    println(Drinks.MangoShake(4,2))

//    val strs: List<String> = arrayListOf("van","hello")
//    strs.forEach(::println)
//    println()
//
//    val objs: List<Any> = strs
//    objs.forEach(::println)
//
//    objs.

//    val output = try {
//        saveNote(
//            "learn new things",
//            ""
//        )
//    } catch (e: EmptyTitleException) {
//        e.message
//    }
//    println(output)
//    println("hello")

//    val exception = Exception("hello", Throwable("No real reason"))
//    throw exception

//    val hobbies = listOf("Coding", "Music", null, "Dance")
//    hobbies.forEach {
//        it?.let {
//            println(it)
//        }
//    }

//    val person = Person(3, "dfg", 34)
//
//    val studentsAndMarks = mutableMapOf<Human, Int>(
//        person to 2300,
//        Developer(3, "fg", 32, listOf("f")) to 3400
//    )
//    studentsAndMarks.put()

//    val person = Person(3, "dfg", 34)
//    val studentsAndMarks = mapOf<Human, Int>(
//        person to 2300,
//        Developer(3, "fg", 32, listOf("f")) to 3400
//    )
//    println(studentsAndMarks[person])
//
//    println(studentsAndMarks.keys.forEach { print("$it,")})
//    println(studentsAndMarks.values.forEach { print("$it,")})


//    val studentsAndMarks = mutableMapOf("Vikash" to 2, Pair("Philipp", 32), Pair("Harry", 5), "Vikash" to 5)
//    println(studentsAndMarks["Vikash"])
//
//    studentsAndMarks.forEach {
//        println("${it.key} got ${it.value}")
//    }
//    studentsAndMarks.put()
//    studentsAndMarks.remove("Vikash")
//    studentsAndMarks["Me"] = 324
//    println(studentsAndMarks)

//    val nameAndMarks: MutableList<Pair<String, Int>> =
//        mutableListOf("Vikash" to 2, Pair("Philipp", 32), Pair("Harry", 24))
//    println(nameAndMarks.first {
//        it.first == "Vikash"
//    })
//    nameAndMarks.forEach {
//        println("${it.first} got ${it.second}")
//    }
//    nameAndMarks.removeIf {
//        it.first == "Vikash"
//    }
//    nameAndMarks.add("Me" to 324)
//    nameAndMarks.add("Me" to 34)
//    println(nameAndMarks)

//    val person = Person(34, "dftg", 234)
//    val person2 = Person(34, "dftg", 234)
//    val person4 = Person(35, "dftg", 233)
//    println(person == person2)
//    println(person == person)
//    println(person == person)
//    println(person == person4)
//    println(Person(34, "dftg", 234) == Person(1, "dftg", 234))
//    println(Person(34, "dftg", 234) == Person(23, "dtg", 234))

//    println("       dAfgC    1 ".chunked(2))

//    println("C71C5E00".toLong(16))

//    println("Enter a no:")
//    val no = readLine()?.toInt()
//    val human: Human = when (no) {
//        in 1..Int.MAX_VALUE -> {
//            Developer(23, "fg", 32, techStack = listOf("ANDROID"))
//        }
//        0 -> {
//            Person(3, "sfaf", 43)
//        }
//        else -> {
//            object : Human() {
//                override val name: String
//                    get() = "Anonymous"
//
//                override fun work() {
//                    println("Didn't feel like working")
//                }
//            }
//        }
//    }
//    println(human is Developer)
//    println(human is Person)
//    println(human is Anonymous)
//    print(human.javaClass.name)
//
//    val decimal = 324.499
//    println(decimal)
//    val integer = decimal.toInt()
//    println(integer)

//    Friends.name

//    println(ColorDialog.hello)
//    val pair: List<Triple<Int, String, Int>> = listOf(Triple(2, "fdg", 45))
//    val list: List<Int> = null

//    var colorDialog: ColorDialog? = ColorDialog()
//
//    colorDialog?.let {
//        it("red") {
//            println(it)
//        }
//    } ?: run {
//
//    }

//    colorDialog?.invoke("") {
//        println(it)
//    }.also {  } ?: run {
//        println("it cannot be null")
//    }

//    val string = "adskjfbdasjkhf"
//    max(string) { a, b ->
//
//    }

//    val intPlus: Int.(Int, Int, Int) -> Int = { a, b, c ->
//        this + a + b + c
//    }
//
//    println(stringPlus("<-", "->"))
//    println(stringPlus("Hello, ", "world!"))

//    println(intPlus.invoke(1, 1))
//    println(intPlus(1, 2))
//    println(2.intPlus(3, 4, 5)) // extension-like call

//    val items = listOf(3, 43, 5, 32, 23, 5, 45)

//    val repeatFun: String.(Int) -> String = { repeat(it) }
//    println(repeatFun("e4576gf", 4))

//    val intToLong: Int.() -> Long = { toLong() }
//    println(intToLong(54))

//    println(
//        "sum is ${
//            items.fold(0) { acc, e ->
//                println("Hello")
//                acc + e
//            }
//        }"
//    )

//    val squareNo: (Int) -> Int = { a ->
//        a*a
//    }
//    println("square of 5 is ${squareNo(5)}")

//    val colorDialog = ColorDialog()
//    colorDialog("Yellow") {
//        println(it)
//    }
//
//    val onClick: (String) -> Unit = { string ->
//        println("You clicked String $string")
//    }

//    println(onClick("Calculator"))
//    println(onClick("Beast mode unlock"))

//    val list = listOf(2, 3, 4, 37, 0, 12)

//    println(list.fold(
//        0
//    ) { acc, element ->
//        acc + element
//    })
//    println(list.fold(
//        10
//    ) { acc, element ->
//        if (element > acc)
//            element
//        else acc
//    })
//    println(list.reduce { max, element ->
//        if (element > max)
//            element
//        else max
//    })
//    println(list.fold(1, Int::times))


//    var color = "White"
//    colorDialog(color) {
//       color = it
//    }
//    println(color)


//    val greenRectangle = Shape(name = "Rectangle", sides = 4, color = "Green")
//    greenRectangle.apply {
//        area = 3245
//        perimeter = 183
//        diagonal = 45
//    }


//    println("MAIN() => Shape name is ${greenRectangle.name}, have ${greenRectangle.sides} sides & is in ${greenRectangle.color} color")

//    val blueSquare = Shape(name = "Square", sides = 4, color = "Blue")
//    println("Shape name is ${blueSquare.name}, have ${blueSquare.sides} sides & is in ${blueSquare.color} color")


//    val person = Person("Vikash", 15)
//    val (name, age) = person
//    println(person)
//    println("Hii, I am $name & $age years old")

//    val person2 = Person("Vikash")
//    person.age = 15
//    person2.age = 15
//    println(person == person2)

//    var yellowHouse = House(rooms = 4, color = "Yellow", cost = 10000.0)
//    println(yellowHouse)
//    yellowHouse = yellowHouse.copy(rooms = yellowHouse.rooms + 2, cost = yellowHouse.cost + 5000.0)
//    println(yellowHouse)
//
//    println(yellowHouse.classifyHouse())
//    var myLaptop = Laptop(ram = 8, processor = "Intel i5", laptopCost = 615.56)
//
///    println(myLaptop)
//    println(myLaptop.classifyLaptop())
//
//    myLaptop = myLaptop.copy(laptopCost = 800.0)
//
//    println(myLaptop)
//    println(myLaptop.classifyLaptop())

//    val list = listOf(23, 45, 23, 5, 6, 3)
//    println(list.product())
//    println(listOf(1, 2, 3, 4, 5, 6).product())

//    println("Enter a number")
//    val no = readLine()?.toInt()
//    if (no != null) {
//        println("$no is a cool number")
//    }
//    no?.let {
//        println("$it power 5 is ${it.pow(5)}")
//        if (no.isPrime())
//            println("$no is a Prime number")
//        else
//        println("$it is a cool number")
//    }


//    println(swapIndex(listOf(3, 2, 43, 4), 3, 0))

//    hii("Vikash Singh", ::greet)

//    val person: Person? = Person(id = 3, name = "Vikash Singh", age = 14)
//    val person: Person? = null
//    person?.bio()
//    diffBio(person)

//    person.greet()
//    person.bio()
//    diffBio(person)

//    println(person.no)
//    person.no = 7
//    println(person.no)
//    person.no = -10
//    println(person.no)

//    person.greet()
//    person.bio()
//    diffBio(person)

//    val developer = Developer(4, "Philipp", 24, listOf("Python", "Java", "Kotlin"))
//    developer.greet()
//    developer.bio()
//    println(developer.no)
//    developer.no = 7
//    println(developer.no)
//    developer.no = -10
//    println(developer.no)

//    val list = listOf(34, 46, 134, 51, 2, 46, 25, 625)
//    val list = listOf(3, 4, 5, 2, 1, 2, 3)
//    val sum = alternatingSum(numbers = list.toIntArray())
//    println("alternating Sum is $sum")

//    search("How to be the Best", isSatisfiedFromResult = true)
//    search("How to be a G.O.A.T", "Microsoft Edge", false)
//    search(browser = "Microsoft Edge", query = "How to be a G.O.A.T", isSatisfiedFromResult = true)
//    search(query = "How to be a G.O.A.T", isSatisfiedFromResult = true)

//    searchString(
//        browser = "Chrome",
//        day = "Sunday",
//    )
//    searchString(
//        query = "",
//        browser = "Chrome",
//        day = "Sunday",
//    )

//    val array = arrayOf(3, 4, 245, 524, 76256, 25)
//    println(getMax(13, 45, 65, 23, *array.toIntArray(), 45, 3))

//    println(findAllEvenNo(listOf(4, 6)))
//    println(findAllEvenNo(numbers = intArrayOf(6, 56, 54), str = "adsfjh"))

//    printMyself(
//        profession = "Android Developer",
//        name = "Vikash Singh",
//    )
//    println()
//    printMyself(
//        "Vikash Singh",
//        age = 17,
//        "Android Developer"
//    )
//    printMyself(profession = "hII")

//    val list = listOf(43, 57, 87, 4, 57, 5, 4)
//    println("The list looks like the following: $list\nSearch for this number:")
//    try {
//        readLine()?.toInt()?.let { no ->
//            val index = findFirstIndexOf(
//                no, list
//            )
//            println("The index of $no is $index")
//        } ?: run {
//            println("cannot be null")
//        }
//    } catch (e: NumberFormatException) {
//        println("Invalid no")
//    }

//    val primeNumbers = primeNumberFrom1To(100)
//    println(primeNumbers)
//
//    val person = Person(name = "Vikash Singh", age = 14)
//    println(personBio(person))

//    println(greet("Vikash"))
//    println(multiply(5, 9))

//    val list = listOf(3, 46, 5347, 2, 275, 87, 34, 2)
//    val evenList = findAllEvenNo(list)
//    println(evenList)

//    val newPerson = person.copy(age = person.age.inc())
//    println(newPerson)

//    println(sumFrom1To(5))
//    println(sumFrom1To(10))

//    println(2 pow 4)
//    println(3 pow 5)

//    println(greeting("Vikash"))
//    fromCountry("India")
//    "Vikash Singh" greetingFromCountry "India"

//    val x = 5
//    printLines(x)

//    printThreeLines()

//    println("Enter your age: ")
//    val input = readLine()
//    val x =5
//
//    try {
//        input?.toInt()?.let { userAge ->
//            when (userAge) {
//                in 0..5 -> {
//                    println("You are a young kid")
//                }
//                in 6..17 -> {
//                    println("You are a teenager")
//                }
//                18 -> {
//                    if(x == 6) {
//                        println("Finally, you're are 18!")
//                    }
//                }
//                19, 20 -> {
//                    println("You are a young adult")
//                }
//                in 21..65 -> {
//                    println("You are an adult")
//                }
//                else -> {
//                    println("You are really old")
//                }
//            }
//        }
//    } catch (exception: NumberFormatException) {
//        println("No, $input is not a valid age")
//    }


//    println("Enter a number n > 1:")
//    val no = readLine()?.toInt() ?: return
//
//    // 6 -> 0, 1, 1, 2, 3, 5
//
//    val fibonacciSeries = mutableListOf<Int>()
//    var a = 0
//    var b = 1
//    var c = 0
//
//    for (i in 1..no) {
//        fibonacciSeries.add(c)
//        a = b
//        b = c
//        c = a + b
//    }
//    println(fibonacciSeries)

//    println("Enter 5 numbers")
//    val list = mutableListOf<Int>()
//    for (i in 1..5) {
//        readLine()?.toInt()?.let {
//            list.add(it)
//        }
//    }
//    println("The 5 numbers in reversed order are:")
//    for (i in list.reversed()) {
//        println(i)
//    }

//    val list = arrayOf<Int>()
//    repeat((1..5).count()) {
//        list.add(readLine()?.toInt() ?: return)
//    }
//    println(list)

//    val list = listOf(32, 3, 45, 345, 43, 4, 3, 9, 123)
//    list.forEach(::println)
//    println(list[0])
//    println(list.)

//    println("Enter 5 numbers: ")
//    try {
//        var sum = 0
//        for (i in 1..5) {
//            sum += readLine()?.toInt() ?: return print("number 1 cannot be null")
//        }

//        println("$no1 to the power of $no2 is ${no1.toDouble().pow(no2).toInt()}")

//        println("average is ${sum / 5F}")
//        println("$no1 to the power of $no2 is ${no1.toDouble().pow(no2).toInt()}")

//    } catch (e: NumberFormatException) {
//        println("Invalid Number")
//    }

//    val myArray = arrayOf(-2343, 2, 434, 45, 45, 13, 5)
//
//    var sum = 0
//    for (i in myArray) {
//        sum += i
//    }
//    println("sum: $sum")
//    println("sum: ${myArray.sum()}")

//    var max = myArray[0]
//    for (i in myArray) {
//        if (i > max) max = i
//    }
//    println("maximum: $max")


//    println(2 pow 7)

//    for (i in 'z' downTo 'a') {
//        println(i)
//    }

//    (1..3).forEach(::println)

//    for (i in 10 downTo 0 step 2) {
//        println(i)
//    }

//    println("Enter a number: ")
//    val no = readLine()?.toInt() ?: return
//    for (i in 0..no) {
//        for (j in 1..i) {
//            print("   ")
//        }
//        for (j in 1 until (no - i) * 2) {
//            print("*  ")
//        }
//        println()
//    }

//    println("Enter number 1: ")
//    try {
//        val no1 = readLine()?.toInt() ?: return print("number 1 cannot be null")
//        println("Enter number 2: ")
//        val no2 = readLine()?.toInt() ?: return print("number 2 cannot be null")
//
////        println("$no1 to the power of $no2 is ${no1.toDouble().pow(no2).toInt()}")
//        var result = 1
//        var i = 0
//        while (i < no2) {
//            result *= no1
//            i++
//        }
//        println("$no1 to the power of $no2 is $result")
////        println("$no1 to the power of $no2 is ${no1.toDouble().pow(no2).toInt()}")
//
//    } catch (e: NumberFormatException) {
//        println("Invalid Number")
//    }

//    println("Enter a number: ")
//    val input = readLine()
//    try {
//        input?.toInt()?.let { no ->
//            println("Let's count from $no down to 0")
////            for (i in no downTo 0) {
////                println(i)
////            }
//            var number = no
//            while (number >= 0) {
//                println(number)
//                number--
//            }
//        }
//    } catch (e: NumberFormatException) {
//        println("Invalid Number")
//    }

//    val myArray = arrayOf("Hello", "Good Morning", "Nice")
//    var index = 0
//    while (index <= myArray.lastIndex) {
//        println(myArray[index])
//        index ++
//    }

//    var x = 2
//
//    while (x > 0) {
//        println(x)
//        x--
//    }
//    println("hello")

//    for(i in x until 10) {
//        println(i)
//    }
//    while (x < 10) {
//        println(x)
//        x++
//    }

//    val myArray = arrayOf(23, 43, 45)

//    println(myArray[5])

//    var index = 0

//    while (index < myArray.size) {
//        println(myArray[index])
//        index++
//    }
//    for (i in 0..myArray.lastIndex) {
//        println(myArray[i])
//    }
//    var no = 1
//
//    while (no in 1..10) {
//        println("$no -> ${no.toDouble().pow(2).toInt()}")
//        no++
//    }

//    for (i in 1 until 3) {
//        println(i)
//    }

//    myArray.forEach {
//        println(it)
//    }

//    val listOfBooks = mutableListOf("Think & Grow Rich", "The Power of now", "Atomic Habit", "CS", "Java", "Python", "Kotlin")
//
//    println(listOfBooks)

//    val newList = listOfBooks.last()
//    listOfBooks.chunked(3) {
//        it.map { str ->
//            mapOf(Pair(str, str.length))
//        }
//    }
////        listOfBooks.map {
////        Book(it, it.length)
////    }
//    listOfBooks.zip(listOf("Napolean Hill", "James Clear", "Me"))
//    println(newList)
//
//
//    listOfBooks.forEachIndexed { index, s ->
//        println("${index.inc()}. $s")
//    }
//    println(listOfBooks[3])
//
//    listOfBooks[0] = "Geeta"
//    listOfBooks.add(4, "HELLO")

//    println(listOfBooks.joinToString(", "))

//    listOfBooks.removeAt(0)
//    listOfBooks.remove("Python")


//    println(listOfBooks.joinToString(", "))


//
//    val coolBooks = arrayOf("Think & Grow Rich", "The Power of now", "Atomic Habit", "CS", "Java", "Python", "Kotlin")

//    coolBooks.forEachIndexed { index, s ->
//        println("${index.inc()}. $s")
//    }
//    println(coolBooks[3])
//
//    coolBooks[0] = "Geeta"
//
//    coolBooks.add("HELLO")
//    coolBooks.forEachIndexed { index, s ->
//        println("${index.inc()}. $s")
//    }
//    println(coolBooks[0])


//    println("Enter your age: ")
//    val input = readLine()

//    try {
//        input?.toInt()?.let { userAge ->
//            when (userAge) {
//                in 1..18 -> {
//                    println("You are not old yet")
//                }
//                in 18..65 -> {
//                    println("You are an adult")
//                }
//                else -> {
//                    println("You are really really old")
//                }
//            }
//        }
//    } catch (exception: NumberFormatException) {
//        println("No, $input is not a valid age")
//    }

//    val userInput = readLine()
//    userInput?.let {
//        println(it.toInt() - 5)
//    }
//    try {
//        val no = userInput?.toInt()
//        println("Yes, $no is a number")
//    } catch (exception: NumberFormatException) {
//        println("No, $userInput is not a number")
//    }


//    userInput?.toCharArray()?.filter { c ->
//        c.isDigit()
//    }?.forEach(::print)
//    println("\ntext is $userInput")
//    userInput?.let {
//        println("text is ${it.uppercase()}")
//    }
//    println("text is ${userInput?.uppercase() ?: ""}")

//    val greeting: String? = "sdfdafadsf"
//
//    println(greeting?.length ?: 4)

//    val string = "hello"
//    if(string.reversed() == string) {
//        println("$string is a palindrome")
//    } else {
//        println("$string is not a palindrome")
//    }

//    val x = -7
//    val y = 6
//    val isSame = if (x + y > 0) 10 else -1
//    println("isSame: $isSame")
//
//    if (x < y || y * x > x - y)
//        println("$x is less than $y")
//    else if (x > y) {
//        println("$x is greater than $y")
//    } else {
//        println("$x is equal to $y")
//    }
//    println("hello")

//    val age = 43
//    when (age) {
//        in 1..12 -> {
//            println("You are a child")
//        }
//        in 13..18 -> {
//            println("You are a teenager")
//        }
//        else -> {
//            println("You are an adult")
//        }
//    }

//    val no = -3
//    if(no > 0) {
//        println("$no is positive")
//    } else if (no == 0) {
//        println("$no is zero")
//    } else {
//        println("$no is negative")
//    }

//    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
//    println(simpleExpression)
//
//    val bool = true
//    val x = 9
//    val y = 3
//    val z = 9
//    val hardExpression = (!(x != z) && bool) || (z > (x + y) && (!bool || y < z))
//                        // true || (false && true) => true
//
//    println(hardExpression)

//    val x = 5
//    val y = 50
//
//    val a = 230
//    val b = 38
//
//    println(x != y || a < b)
//    println(x > y == a > b && x <= y || a != y)

//    val no1 = 55
//    val no2 = -56
//    println(no1 >= no2)
//    println(no1.absoluteValue == no2.absoluteValue)
//    println(no1 > no2 && no1 == no2)

//    val name = "vikash singh"
//    name.splitToSequence(' ').toList().forEach {
//        print(it.elementAt(0))
//    }

//    val greeting = "Hello"
//    val string = "Greeting is $greeting"
//    println("String: $string")

//    val no = 3456
//    var name = "Vikash Singh $no"
//    println(
//        name.map { c ->
//         c.t
//        }.joinToString("")
//    )
//    println(name.subSequence(0, name.indexOf(" ")))
//    println(name.filter {
//        it.isLowerCase()
//    })
//    println(name.codePointAt(5))
//    println(name.drop(5).uppercase().dropLast(2))
//    println(name.filter { it.isDigit() })
//    println(name.forEach { c ->
//        println("$c")
//    })
//    println(name)
//    name =name.uppercase()
//    println(name.uppercase())
//    println(name.uppercase().dropLastWhile { !it.isLetter() })


//    val radius = 5.5
//    val volumeOfSphere = 0.75 * PI * radius.pow(3)
//    println("Volume of Sphere of radius $radius is $volumeOfSphere")

//    val x = 3
//    println("x: $x")
//    val y = 4
//    println("x + y: ${x + y}")
//    val z = 5
//    println("x + y + z: ${x + y + z}")


//    println(1.345f / 7)

//    var no1 = 34
//    var no2 = 38
//    val result = 324 / 435F
//    val ans = result.toString().dropLast((result.toString().lastIndex - result.toString().indexOf('.')) - 2)
//    println("Sum of $no1 and $no2 is ${no1 + no2}")

//    no1 = 324
//    no2 = 435
//    println("Sum of $no1 and $no2 is ${no1 + no2}")


//    var no1 = 39F
//    no1 /= 10 // no1 = no1 + 38
//    println("ans: is $ans")

//    var age: Int = 935476546
//    val name = "Vikash Singh"
//    println("My name is $name & age is $age")
//    println(age)
//    age= 7
//    println(age)
//    var isIAmSmart: Boolean = age != 7
//    val averageMarks: Float = 35.34543635635F
//    val sdjf: Double = 35.34543635635
//    println(averageMarks)
//    println(sdjf)
//    println(isIAmSmart)
//    val alphabet: Char = 'a'
//    println(alphabet)
//
//    isIAmSmart = true

//    val age = 78
//    val myFavoriteNo = 94
//    println("my age is $age")
//    println("my favorite no is $myFavoriteNo")
}