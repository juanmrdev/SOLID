package variantsArchitecture

import variantsArchitecture.Variations.*
import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.uimappers.ScreenUIMapperVariationY
import variantsArchitecture.uimappers.DummyScreenUiMapper
import variantsArchitecture.uimappers.ScreenUIMapperVariationX
import variantsArchitecture.uimappers.ScreenUIMapperVariationZ
import variantsArchitecture.viewmodels.DummyScreenViewModel

fun main() {
    val (dummyScreenMapper, variation) =
        FactoryDummyScreenUiMapper(VARIATION_Y)

    val viewModel = DummyScreenViewModel(dummyScreenMapper, variation)

    println(viewModel.getUiDataList())
}

object FactoryDummyScreenUiMapper {
    private const val param1 = "param1"
    private const val param2 = "param2"

    operator fun invoke(variation: Variations): Pair<DummyScreenUiMapper<DomainData, DummyScreenUiModel>, Variations> {
        return when (variation) {
            VARIATION_X -> Pair(ScreenUIMapperVariationX(param1 = param1, param2 = param2), VARIATION_X)
            VARIATION_Y -> Pair(ScreenUIMapperVariationY(param1 = param1, param2 = param2), VARIATION_Y)
            VARIATION_Z -> Pair(ScreenUIMapperVariationZ(), VARIATION_Z)
        }
    }
}
enum class Variations {
    VARIATION_X,
    VARIATION_Y,
    VARIATION_Z
}
