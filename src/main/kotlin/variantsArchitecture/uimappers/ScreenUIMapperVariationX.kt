package variantsArchitecture.uimappers

import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.models.DummyScreenUiModel.*
import variantsArchitecture.domain.DomainData.DummyScreenDomainData

class ScreenUIMapperVariationX(
    param1: String,
    param2: String
) : BaseDummyScreenUIMapper<DummyScreenDomainData, DummyScreenUiModel>(param1, param2) {

    override fun getSeparator(): DummyScreenUiModel = Separator

    override fun injectHeader(domainData: DummyScreenDomainData): DummyScreenUiModel =
        SectionHeader(data = domainData.data)

    override fun injectSectionTwo(domainData: DummyScreenDomainData): DummyScreenUiModel = domainData.run {
        SectionTwo(
            data7 = domainData.data7,
            data8 = domainData. data8,
            data9 = domainData.data9
        )
    }

    override fun getSectionOne(domainData: DummyScreenDomainData): DummyScreenUiModel = domainData.run {
        SectionOneVariationX(
            data1 = data1,
            data2 = data2,
            data3 = data3
        )
    }

    override fun getSectionFooter(domainData: DummyScreenDomainData): DummyScreenUiModel = domainData.run {
        SectionFooterVariationX(data10 = data10)
    }
}