package variantsArchitecture.uimappers.firstScreen

import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.models.DummyScreenUiModel.*
import variantsArchitecture.domain.DomainData.DummyScreenDomainData
import variantsArchitecture.uimappers.BaseDummyScreenUIMapper

class ScreenUIMapperVariationX(
    param1: String,
    param2: String
) : BaseDummyScreenUIMapper<DummyScreenDomainData, DummyScreenUiModel>(param1, param2) {

    override fun getSeparator(): DummyScreenUiModel = Separator

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