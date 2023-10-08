const val DAYS_OF_THE_WEEK = 7
fun main(){
    println("Hello, World")

    val language = "Kotlin"
    println(language)

    var dayOfWeek = "Monday"
    println(dayOfWeek)

    dayOfWeek = "Tuesday"
    println(dayOfWeek)

    val text: String = "Hello, I am studying kotlin now."
    println(text)
    println(DAYS_OF_THE_WEEK)
    val name = "Alice"
    println("Hello, $name!")
   // const val DAYS_OF_THE_WEEK = 7

    val d: Int
    val check = true
    d = if (check){
        1
    }else{
        2
    }
    println(d)

    val temp = 18
    val description = when {
        temp < 0 -> {
            "very cold"
        }
        temp < 10 -> {
            "a bit cold"
        }
        temp < 20 -> {
            "Warm"
        }

        else -> {
            "Hot"
        }
    }
    println(description)

//    val obj = "Hello"
//    when (obj){
//        "2" -> println("One")
//        "Hello" -> println("Greeting")
//        else -> println("Unknown")
//    }
}