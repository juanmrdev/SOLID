package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel


class ScreenUIMapperVariationZ : DummyScreenUiMapper<DummyScreenDomainDataComposed, DummyScreenUiModel> {

    override fun getUiItemList(domainData: DummyScreenDomainDataComposed): List<DummyScreenUiModel> {
        return mutableListOf<DummyScreenUiModel>().apply {
            add(getSeparator())
        }
    }

    override fun getSeparator(): DummyScreenUiModel = DummyScreenUiModel.Separator

}