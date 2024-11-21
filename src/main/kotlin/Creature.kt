interface Creature {
    var health: Int
    var power: Int

    fun attack(creature: Creature){
        creature.health -= power;
    }
}