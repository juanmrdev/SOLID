package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel

interface DummyScreenUiMapper <out T: DomainData, out R: DummyScreenUiModel> {
    fun getSeparator(): R
    fun getUiItemList(domainData: @UnsafeVariance T): List<R>
}

interface DummyScreenUiMapperWithOneAndFooter <T: DomainData, out R: DummyScreenUiModel>: DummyScreenUiMapper<T, R> {
    fun getSectionOne(domainData: T): R
    fun getSectionFooter(domainData: T): R
}