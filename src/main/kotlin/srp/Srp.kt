package srp

class GoodPlayer(
    private val name: String,
    private val level: Int
) {

    fun getPlayerInfo(): String {
        return "$name(lv: $level)"
    }
}

class GameCommunicator(
    private val messageApi: ApiMessage
) {

    fun sendMessage(player: GoodPlayer, message: String) {
        messageApi.performMessage(player, message)
    }
}