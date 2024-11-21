open class Human : Creature{
    override var health: Int = 100
    override var power: Int = 20

    fun heal(health: Int){
        this.health += health
    }
}