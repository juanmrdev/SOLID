package variantsArchitecture.uimappers

import variantsArchitecture.domain.DomainData
import variantsArchitecture.models.DummyScreenUiModel

//WE USE THIS RESTRICTION TYPE  TO AVOID RUNTIME ERRORS!
interface DummyScreenUiMapper <out T: DomainData, out R: DummyScreenUiModel> {

    /**
     * Strategy
     */
    fun getUiItemList(domainData: @UnsafeVariance T): List<R>
}


//LARGE NAMES DOESN'T MATTER! IS A GOOD PRACTICE
interface DummyScreenUiMapperWithOneAndFooter <T: DomainData, out R: DummyScreenUiModel>: DummyScreenUiMapper<T, R> {
    fun getSeparator(): R
    fun getSectionOne(domainData: T): R
    fun getSectionFooter(domainData: T): R
}