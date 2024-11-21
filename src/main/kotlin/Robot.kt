class Robot : Creature {
    override var health: Int = 150
    var battery: Int = 100

    override var power: Int = 0
        get() = when(battery){
        0 -> { 0 }
        in 1..20 -> { 5 }
        in 21..40 -> { 10 }
        in 41..60 -> { 15 }
        in 61..80 -> { 20 }
        else -> { 25 }
    }

    override fun attack(creature: Creature) {
        super.attack(creature)
        battery -= 10
    }
}