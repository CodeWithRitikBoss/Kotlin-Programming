fun main() {
    println("If else with return in kotlin\n")
    val a: Boolean = true

    val result = if (a) {
        println("a is true")
        10
    } else {
        println("a is false")
        20
    }
    println("result is $result")
}