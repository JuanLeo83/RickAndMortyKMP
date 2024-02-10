package data.source

interface SampleDataSource {
    fun sampleFunction(): String
}

class SampleDataSourceImpl : SampleDataSource {
    override fun sampleFunction(): String {
        return "Hello from SampleDataSourceImpl"
    }
}