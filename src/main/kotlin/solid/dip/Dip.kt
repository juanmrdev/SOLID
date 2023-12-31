package solid.dip

class GoodGame(
    players: Int,
    executeGameWithPlayers: CreateGame
) {
    init {
        executeGameWithPlayers.createMapWithPlayers(players)
    }
}

interface CreateGame {
    fun createMapWithPlayers(numPlayers: Int)
}

class ExecuteGoodGameWithPlayers: CreateGame {

    override fun createMapWithPlayers(numPlayers: Int) {
        println("Map is created with $numPlayers players!")
    }
}