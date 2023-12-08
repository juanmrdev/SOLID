package variantsArchitecture.models

sealed interface DummyScreenUiModel {

    object Separator: DummyScreenUiModel

    data class SectionHeader(val data: String): DummyScreenUiModel

    data class SectionOneVariationX(
        val data1: String,
        val data2: String,
        val data3: String
    ): DummyScreenUiModel

    data class SectionOneVariationY(
        val data4: String,
        val data5: String,
        val data6: String
    ): DummyScreenUiModel

    /**
     * Composition option
     */
    /*data class SectionOneVariationY(
        val data4: String,
        val data5: String,
        val data6: String,
        private val sectionOneVariationX: SectionOneVariationX,
        val data1: String = sectionOneVariationX.data1
    ): DummyScreenUiModel*/

    data class SectionTwo(
        val data7: String,
        val data8: String,
        val data9: String
    ): DummyScreenUiModel

    data class SectionFooterVariationX(
        val data10: String
    ): DummyScreenUiModel

    data class SectionFooterVariationY(
        val data11: String,
        val data12: String
    ): DummyScreenUiModel
}