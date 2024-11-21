import kotlin.coroutines.*
class Game(
    private val game: () -> Unit,
    private val creatures: Array<Creature>
) {
    private var isPlaying = false
    fun start() {
        isPlaying = true
        while(creatures.all { it.health > 0 } && isPlaying){
            game.invoke()
        }
        println("GAME IS OVER")
    }

    fun stop(){
        isPlaying = false
    }
}