package srp

class BadPlayer(
    private val name: String,
    private val level: Int,
    private val messageApi: ApiMessage
) {

    fun getPlayerInfo(): String {
        return "$name(lv: $level)"
    }

    fun sendMessage(player: BadPlayer, message: String) {
        messageApi.performMessage(player, message)
    }
}