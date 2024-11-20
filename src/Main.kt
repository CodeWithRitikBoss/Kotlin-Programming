fun main() {
    println("Hello World!")
    print()

    // var variable are mutable it means changeable.
    // val variable are immutable it means can't changeable.
    var x: Int = 12
    println("The value of x is : $x")
    x = 13
    println("Now the value of x is : $x")

    val y: Int = 34
    println("The value of y is : $y")
    println("The value of y is : "+ y)
}

fun print(){
    print("Print one")
    print("Print two\n")
    println("Print three")
}

