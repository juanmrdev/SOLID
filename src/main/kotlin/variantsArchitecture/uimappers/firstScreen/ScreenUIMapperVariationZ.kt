package variantsArchitecture.uimappers.firstScreen

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel
import variantsArchitecture.uimappers.DummyScreenUiMapper


//REMEMBER WE CAN USE THE INTERFACES THAT WE DEFINE BEFORE USING INTERFACE SEGREGATION
class ScreenUIMapperVariationZ : DummyScreenUiMapper<DummyScreenDomainDataComposed, DummyScreenUiModel> {

    override fun getUiItemList(domainData: DummyScreenDomainDataComposed): List<DummyScreenUiModel> {
        return mutableListOf<DummyScreenUiModel>().apply {
            add(DummyScreenUiModel.SectionHeader(domainData.domainDataLegacy.data))
        }
    }
}