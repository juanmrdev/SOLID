package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel

interface DummyScreenUiMapper <out T: DomainData, out R> {

    fun getUiItemList(domainData: @UnsafeVariance T): List<R>
}

interface DummyScreenUiMapperWithOneAndFooter <T: DomainData, out R>: DummyScreenUiMapper<T, R> {

    fun getSectionOne(domainData: T): DummyScreenUiModel
    fun getSectionFooter(domainData: T): DummyScreenUiModel
}