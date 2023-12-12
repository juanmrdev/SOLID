package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.models.DummyScreenUiModel.*

class ScreenUIMapperVariationY(
    param1: String,
    param2: String
): BaseDummyScreenUIMapper<DummyScreenDomainDataComposed, DummyScreenUiModel>(param1, param2) {

    override fun getSeparator(): DummyScreenUiModel = Separator

    override fun getSectionHeader(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel =
        SectionHeader(data = domainData.domainDataLegacy.data)

    override fun getSectionTwo(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel = domainData.run {
        SectionTwo(
            data7 = domainDataLegacy.data7,
            data8 = domainDataLegacy.data8,
            data9 = domainDataLegacy.data9
        )
    }

    override fun getSectionOne(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel = domainData.run {
        SectionOneVariationY(
            data4 = domainDataLegacy.data4,
            data5 = domainDataLegacy.data5,
            data6 = domainDataLegacy.data6
        )
    }

    override fun getSectionFooter(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel = domainData.run {
        SectionFooterVariationY(
            data11 = domainDataLegacy.data11,
            data12 = domainDataLegacy.data12
        )
    }
}
