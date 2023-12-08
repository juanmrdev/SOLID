package solid.`lsp&isp`

import java.lang.Exception

fun main() {

    /**VIOLATED LCP & ISP*/
    val badMap = BadWindMap()
    badMap.createMap()
    badMap.eventWind()
    try {
        badMap.eventSnow()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    println()/**======================================================================================================*/

    /**SUCCESSFUL LCP & ISP*/
    val goodMap = GoodSnowMap()
    goodMap.createMap()
    goodMap.eventSnow()
}