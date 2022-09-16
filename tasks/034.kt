fun main(args: Array<String>) {
    konFeti(2,20.8,3,12.0)
}
fun konFeti(x:Int,a: Double, y: Int, b:Double) {
    val xprice: Double = a/x
    val yprice: Double = b/y
    val xy: Double = xprice / yprice
    println("1kg chocolate candies = $xprice")
    println("1kg iriski = $yprice")
    println("chocolate expensive then iriski in $xy times")
}
