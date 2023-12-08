package solid.ocp

interface BadCharacter {
    val damage: Int
}

class BadVladimir: BadCharacter {
    override val damage: Int = 10
    val bleeding = 30
}

class BadAshe: BadCharacter {
    override val damage: Int = 10
    val freezing = 10
}

class BadMasterYi: BadCharacter {
    override val damage: Int = 10
    val criticalHit = 50
}
class MyChampion: BadCharacter {
    override val damage: Int = 1
    val hisOwnDamage = 4
}


class BadLolPlayer {

    var totalDamage = 10
    lateinit var nameCharacter: String

    fun userStrongestAbility(badCharacter: BadCharacter) {
        totalDamage += when (badCharacter) {
            is BadVladimir -> {
                nameCharacter = "Vladimir"
                badCharacter.damage + badCharacter.bleeding
            }
            is BadAshe -> {
                nameCharacter = "Ashe"
                badCharacter.damage + badCharacter.freezing
            }
            is BadMasterYi -> {
                nameCharacter = "Master Yi"
                badCharacter.damage + badCharacter.criticalHit
            }
            else -> 0
        }
    }
}