package dip

fun main() {


    /**VIOLATED DIP*/
    BadGame(players = 6)

    println()/**======================================================================================================*/

    /**SUCCESSFUL DIP*/
    GoodGame(players = 6, executeGameWithPlayers = ExecuteGoodGameWithPlayers())
}