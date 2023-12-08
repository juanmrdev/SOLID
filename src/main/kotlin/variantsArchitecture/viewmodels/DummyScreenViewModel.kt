package variantsArchitecture.viewmodels

import variantsArchitecture.Variations
import variantsArchitecture.domain.DomainData
import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.uimappers.DummyScreenUiMapper
import variantsArchitecture.models.DummyScreenUiModel

class DummyScreenViewModel(
    private val dummyScreenUIMapper: DummyScreenUiMapper<DomainData, DummyScreenUiModel>,
    variations: Variations
) : VariationXViewModel by VariationXViewModelImpl() {

    private lateinit var uiModelList: List<DummyScreenUiModel>

    private var domainData: DummyScreenDomainData
    private var domainDataComposed: DummyScreenDomainDataComposed

    init {
        domainData = getDomainData()
        domainDataComposed = getDomainDataComposed()
        initVariation(
            when(variations) {
                Variations.VARIATION_X -> domainData
                Variations.VARIATION_Y -> domainDataComposed
                Variations.VARIATION_Z -> domainData
            }
        )
    }

    private fun initVariation(domainVariation: DomainData) {
        uiModelList = dummyScreenUIMapper.getUiItemList(domainVariation)
    }

    fun getUiDataList() = uiModelList

    private fun getDomainData() = DummyScreenDomainData(
        data = "data",
        data1 = "data1",
        data2 = "data2",
        data3 = "data3",
        data4 = "data4",
        data5 = "data5",
        data6 = "data6",
        data7 = "data7",
        data8 = "data8",
        data9 = "data9",
        data10 = "data10",
        data11 = "data11",
        data12 = "data12",
    )

    private fun getDomainDataComposed() = DummyScreenDomainDataComposed(
        domainData = domainData,
        newData = "newData"
    )
}