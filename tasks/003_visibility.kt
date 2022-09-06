class MyClass {
    private var color: String = "green"
    var age: Int = 20
    private fun hi(name: String = "Mike"){
        println("Hello $name")
    }
    fun showColor(){
        this.hi()
    }
}

fun main(args: Array<String>) {
    var obj = MyClass()
    obj.showColor()
}

