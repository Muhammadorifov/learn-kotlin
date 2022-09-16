fun Func(x:Double,A:Double,y:Double,B:Double){

    println("1kg shokolad " + (A/x))
    println("1kg iris " + (B/y))
    println("Shocolad doroje irisok v " + (A/x)/(B/y) + " raza ")
}
fun main(){
    println(Func(3.5,17.8,5.0,9.0))
}
