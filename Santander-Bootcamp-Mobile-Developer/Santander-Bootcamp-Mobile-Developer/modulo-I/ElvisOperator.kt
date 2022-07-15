fun main() {
    //Null safety
    val a:Int? = null
    val b:Int? = 9
    
    //Elvis operator
    //Se a nâo for nulo, atribui o valor dele para number
    //Se for, e b não for, atribui o valor de b
    //Senão, number recebe 0
    val number = a?: b:? 0
}