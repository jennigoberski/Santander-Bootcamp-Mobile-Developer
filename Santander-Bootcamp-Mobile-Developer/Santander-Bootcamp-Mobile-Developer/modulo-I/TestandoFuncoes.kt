fun main() {
    val z:Int
    val x:Int
    
    z = calculate(6, 5, ::sum)
    println("Vou calcular! 6 + 5")
    println(z)
    x = calculate(6,5){a,b -> 
        println("Vou calcular! $a * $b")
        a*b}
    println(x)
}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int) -> Int):Int {
    val result = operation(n1, n2)
    return result
}