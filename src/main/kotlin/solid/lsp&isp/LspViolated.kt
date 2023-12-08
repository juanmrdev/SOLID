package solid.`lsp&isp`

import java.lang.IllegalArgumentException

interface BadMap {
    fun createMap()
    fun eventSnow()
    fun eventWind()
}

class BadSnowMap: BadMap {
    override fun createMap() {
        println("Snow map has been created")
    }
    override fun eventSnow() {
        println("Snowstorm is falling!")
    }

    override fun eventWind() {
        //TODO :(
    }
}

class BadWindMap: BadMap {
    override fun createMap() {
        println("Wind map has been created")
    }

    override fun eventWind() {
        println("A hurricane is approaching!")
    }

    override fun eventSnow() {
        throw IllegalArgumentException(":(")
    }
}