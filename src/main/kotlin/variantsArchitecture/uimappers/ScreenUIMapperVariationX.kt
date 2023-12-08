package variantsArchitecture.uimappers

import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.models.DummyScreenUiModel.SectionFooterVariationX
import variantsArchitecture.models.DummyScreenUiModel.SectionOneVariationX
import variantsArchitecture.domain.DomainData.DummyScreenDomainData

class ScreenUIMapperVariationX(
    param1: String,
    param2: String
) : BaseDummyScreenUIMapper<DummyScreenDomainData, DummyScreenUiModel>(param1, param2) {

    override fun injectUiItemList(domainData: DummyScreenDomainData): List<DummyScreenUiModel> {
        return mutableListOf<DummyScreenUiModel>().apply {
            add(getSectionHeader(domainData = domainData))
            add(DummyScreenUiModel.Separator)
            add(getSectionOne(domainData = domainData))
            add(DummyScreenUiModel.Separator)
            add(getSectionTwo(domainData = domainData))
            add(DummyScreenUiModel.Separator)
            add(getSectionFooter(domainData = domainData))
        }
    }

    override fun injectHeader(domainData: DummyScreenDomainData): DummyScreenUiModel =
        DummyScreenUiModel.SectionHeader(data = domainData.data)


    override fun injectSectionTwo(domainData: DummyScreenDomainData): DummyScreenUiModel =
        DummyScreenUiModel.SectionTwo(
            data7 = domainData.data7,
            data8 = domainData. data8,
            data9 = domainData.data9
        )

    override fun getSectionOne(domainData: DummyScreenDomainData): DummyScreenUiModel {
        domainData.run {
            return SectionOneVariationX(data1 = data1, data2 = data2, data3 = data3)
        }
    }

    override fun getSectionFooter(domainData: DummyScreenDomainData): DummyScreenUiModel {
        domainData.run {
            return SectionFooterVariationX(data10 = data10)
        }
    }
}