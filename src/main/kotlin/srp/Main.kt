package srp

fun main() {

    /**VIOLATED SRP*/
    val player = GoodPlayer(name = "Juan", level = 100)
    val communicator = GameCommunicator(ApiMessage)

    communicator.sendMessage(player = player, message = "Single Responsibility successful")

    println()/**======================================================================================================*/

    /**SUCCESSFUL SRP*/
    val badPlayer = BadPlayer(name = "John", level = 20, ApiMessage)
    badPlayer.sendMessage(player = badPlayer, message = "Violated SRP")
}



object ApiMessage {
    inline fun <reified T> performMessage(destination: T, message: String) {
        when (destination) {
            is BadPlayer -> println(
                "Message sent by ${
                    destination.getPlayerInfo()
                }:\n$message"
            )

            is GoodPlayer -> println(
                "Message sent by ${
                    destination.getPlayerInfo()
                }:\n$message"
            )
        }
    }
}