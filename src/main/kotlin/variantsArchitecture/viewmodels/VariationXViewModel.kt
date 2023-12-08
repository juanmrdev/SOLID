package variantsArchitecture.viewmodels

interface VariationXViewModel {

    fun apiServiceCall()
}

class VariationXViewModelImpl: VariationXViewModel {
    override fun apiServiceCall() {
        println("Calling the api service")
    }
}