package ocp

fun main() {

    /**VIOLATED OCP*/
    val badLolPlayer = BadLolPlayer()
    val vladimir = BadVladimir()

    badLolPlayer.userStrongestAbility(vladimir)
    println("Total power of ${badLolPlayer.nameCharacter}: ${badLolPlayer.totalDamage}")

    println()/**======================================================================================================*/

    /**SUCCESSFUL OCP*/
    val goodLolPlayer = GoodLolPlayer()
    val ashe =  GoodAshe()

    goodLolPlayer.userStrongestAbility(ashe)
    println("Total power of ${goodLolPlayer.nameCharacter}: ${goodLolPlayer.totalDamage}")
}