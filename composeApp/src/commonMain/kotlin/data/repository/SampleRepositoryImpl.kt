package data.repository

import data.source.SampleDataSource
import domain.repository.SampleRepository

class SampleRepositoryImpl(private val sampleDataSource: SampleDataSource) : SampleRepository {
    override fun sampleFunction(): String {
        return sampleDataSource.sampleFunction()
    }
}