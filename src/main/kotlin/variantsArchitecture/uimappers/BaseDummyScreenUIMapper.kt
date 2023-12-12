package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel

abstract class BaseDummyScreenUIMapper<T: DomainData, out R: DummyScreenUiModel>(
    param1: String,
    param2: String
) : DummyScreenUiMapperWithOneAndFooter<T, R> {

    override fun getUiItemList(domainData: T): List<R> {
        return mutableListOf<R>().apply {
            add(getSectionHeader(domainData = domainData))
            add(getSeparator())
            add(getSectionOne(domainData = domainData))
            add(getSeparator())
            add(getSectionTwo(domainData = domainData))
            add(getSeparator())
            add(getSectionFooter(domainData = domainData))
        }
    }

    abstract fun getSectionHeader(domainData: T): R

    abstract fun getSectionTwo(domainData: T): R
}