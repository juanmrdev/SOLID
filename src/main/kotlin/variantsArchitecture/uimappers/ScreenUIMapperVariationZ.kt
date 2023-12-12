package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel


class ScreenUIMapperVariationZ : DummyScreenUiMapper<DummyScreenDomainDataComposed, DummyScreenUiModel> {

    override fun getUiItemList(domainData: DummyScreenDomainDataComposed): List<DummyScreenUiModel> {
        return mutableListOf<DummyScreenUiModel>().apply {
            /*add(DummyScreenUiModel.Separator)
            add(getSectionOne(domainData = domainData))
            add(DummyScreenUiModel.Separator)
            add(getSectionTwo(domainData = domainData))
            add(getSectionThree(domainData = domainData))
            add(getSectionFour(domainData = domainData))
            add(getSectionFive(domainData = domainData))
            add(getSectionSix(domainData = domainData))
            add(getSectionSeven(domainData = domainData))
            add(DummyScreenUiModel.Separator)*/
        }
    }

    override fun getSeparator(): DummyScreenUiModel = DummyScreenUiModel.Separator

}