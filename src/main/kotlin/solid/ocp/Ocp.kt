package solid.ocp

interface GoodCharacter {
    val damage: Int
    fun useUltimate(basePowerPlayer: Int): Int
    fun getName(): String
}

class GoodVladimir: GoodCharacter {
    override val damage: Int = 10
    private val bleeding = 30

    override fun useUltimate(basePowerPlayer: Int): Int {
        return basePowerPlayer + damage + bleeding
    }

    override fun getName(): String = "Vladimir"
}

class GoodAshe: GoodCharacter {
    override val damage: Int = 10
    private val freezing = 10

    override fun useUltimate(basePowerPlayer: Int): Int {
        return basePowerPlayer + damage + freezing
    }

    override fun getName(): String = "Ashe"
}

class GoodMasterYi: GoodCharacter {
    override val damage: Int = 10
    private val criticalHit = 50

    override fun useUltimate(basePowerPlayer: Int): Int {
        return basePowerPlayer + damage + criticalHit
    }

    override fun getName(): String = "Master Yi"
}


class GoodLolPlayer {

    var totalDamage = 10
    lateinit var nameCharacter: String

    fun userStrongestAbility(goodCharacter: GoodCharacter) {
        totalDamage = goodCharacter.useUltimate(totalDamage)
        nameCharacter = goodCharacter.getName()
    }
}