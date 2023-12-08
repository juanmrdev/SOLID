package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData

abstract class BaseDummyScreenUIMapper<T: DomainData, out R>(
    param1: String,
    param2: String
) : DummyScreenUiMapperWithOneAndFooter<T, R> {

    abstract fun injectUiItemList(domainData: T): List<R>
    abstract fun injectHeader(domainData: T): R
    abstract fun injectSectionTwo(domainData: T): R

    override fun getUiItemList(domainData: T): List<R> = injectUiItemList(domainData)

    fun getSectionHeader(domainData: T): R = injectHeader(domainData)

    fun getSectionTwo(domainData: T): R = injectSectionTwo(domainData)
}