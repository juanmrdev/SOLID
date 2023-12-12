package variantsArchitecture.domain

sealed interface DomainData {

    data class DummyScreenDomainData(
        val data: String,
        val data1: String,
        val data2: String,
        val data3: String,
        val data4: String,
        val data5: String,
        val data6: String,
        val data7: String,
        val data8: String,
        val data9: String,
        val data10: String,
        val data11: String,
        val data12: String,
    ) : DomainData

    data class DummyScreenDomainDataComposed(
        val domainDataLegacy: DummyScreenDomainData,
        val newData: String
    ) : DomainData
}