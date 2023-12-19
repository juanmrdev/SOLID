package variantsArchitecture.uimappers.firstScreen

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.models.DummyScreenUiModel.*
import variantsArchitecture.uimappers.BaseDummyScreenUIMapper

class ScreenUIMapperVariationY(
    param1: String,
    param2: String
): BaseDummyScreenUIMapper<DummyScreenDomainDataComposed, DummyScreenUiModel>(param1, param2) {

    override fun getSeparator(): DummyScreenUiModel = Separator
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
