import kotlin.random.Random

class PoleChudes {
    var secretWord = ""
    var isWordFound = false
    init {
        this.secretWord = this.randomWord()
    }
    fun randomWord(): String {
        var num = Random.nextInt(0, 5)
        var word = when(num){
            0 -> "apple"
            1 -> "car"
            2 -> "coffee"
            3 -> "computer"
            4 -> "mouse"
            5 -> "house"
            else -> {""}
        }
        return word
    }
    fun findChar(){
        println("Please enter your character:")
        var ch = readLine()!!
        if(ch in this.secretWord){
            println("You are right!")
        } else {
            println("You are wrong!")
        }
    }
    fun showSecret(){
        println(this.secretWord)
    }
}

fun main(args: Array<String>) {
    var game = PoleChudes()
    game.showSecret()
    while(!game.isWordFound){
        game.findChar()
    }
}

