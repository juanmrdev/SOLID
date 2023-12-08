package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData.*
import variantsArchitecture.models.DummyScreenUiModel

class ScreenUIMapperVariationY(
    param1: String,
    param2: String
): BaseDummyScreenUIMapper<DummyScreenDomainDataComposed, DummyScreenUiModel>(param1, param2) {

    override fun injectUiItemList(domainData: DummyScreenDomainDataComposed): List<DummyScreenUiModel> {
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

    override fun injectHeader(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel =
        DummyScreenUiModel.SectionHeader(data = domainData.domainData.data)


    override fun injectSectionTwo(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel =
        DummyScreenUiModel.SectionTwo(
            data7 = domainData.domainData.data7,
            data8 = domainData.domainData.data8,
            data9 = domainData.domainData.data9
        )

    override fun getSectionOne(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel =
        DummyScreenUiModel.SectionTwo(
            data7 = domainData.domainData.data7,
            data8 = domainData.domainData.data8,
            data9 = domainData.domainData.data9
        )

    override fun getSectionFooter(domainData: DummyScreenDomainDataComposed): DummyScreenUiModel {
        domainData.run {
            return DummyScreenUiModel.SectionFooterVariationY(
                data11 = this.domainData.data11,
                data12 = this.domainData.data12
            )
        }
    }
}
