package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel

abstract class BaseDummyScreenUIMapper<T: DomainData, out R: DummyScreenUiModel>(
    param1: String,
    param2: String
) : DummyScreenUiMapperWithOneAndFooter<T, R> {

    override fun getUiItemList(domainData: T): List<R> {
        return mutableListOf<R>().apply {
            //add(getSectionHeader(domainData = domainData))
            add(getSeparator())
            add(getSectionOne(domainData = domainData))
            add(getSeparator())
            //add(getSectionTwo(domainData = domainData))
            add(getSeparator())
            add(getSectionFooter(domainData = domainData))
        }
    }

    private fun getSectionHeader(domainData: DomainData.DummyScreenDomainData): DummyScreenUiModel {
        return DummyScreenUiModel.SectionHeader(data = domainData.data)
    }

    private fun getSectionTwo(domainData: DomainData.DummyScreenDomainData): DummyScreenUiModel = domainData.run {
        DummyScreenUiModel.SectionTwo(
            data7 = data7,
            data8 = data8,
            data9 = data9
        )
    }
}