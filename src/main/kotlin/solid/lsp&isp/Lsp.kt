package solid.`lsp&isp`

interface GoodMap {
    fun createMap()
}

interface SnowMap: GoodMap {
    fun eventSnow()
}

interface WindMap: GoodMap {
    fun eventWind()
}

class GoodSnowMap: SnowMap {
    override fun createMap() {
        println("Snow map has been created")
    }
    override fun eventSnow() {
        println("Snowstorm is falling!")
    }
}

class GoodWindMap: WindMap {
    override fun createMap() {
        println("Wind map has been created")
    }

    override fun eventWind() {
        println("A hurricane is approaching!")
    }
}