package solid.dip

class BadGame(
    players: Int
) {

    private val executeGameWithPlayers = ExecuteGameWithPlayers()

    init {
        executeGameWithPlayers.createMapWithPlayers(players)
    }
}

class ExecuteGameWithPlayers {

    fun createMapWithPlayers(numPlayers: Int){
        println("Map is created with $numPlayers players!")
    }
}