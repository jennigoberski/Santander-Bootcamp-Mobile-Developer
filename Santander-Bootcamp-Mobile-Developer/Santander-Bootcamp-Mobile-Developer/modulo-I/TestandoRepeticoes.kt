fun main() {
    for(i in 0..20 step 1) {
        println("For 1: $i")
        //For normal com range
    }
    
    for(i in 0 until 10) {
        println("For 2: $i")
        //Until vai até n-1
    }
    
    for(i in 10 downTo 0) {
        println("For 3: $i")
        //For decrescente
    }
    
    var text = "Kotlin"
    
    for(letter in text) {
        println(letter)
        //For Each normal
    }
}