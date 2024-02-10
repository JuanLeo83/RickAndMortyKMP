package di

import data.repository.SampleRepositoryImpl
import data.source.SampleDataSource
import data.source.SampleDataSourceImpl
import domain.repository.SampleRepository
import org.koin.dsl.module

val commonDataModule = module {
    single<SampleRepository> { SampleRepositoryImpl(get()) }
    single<SampleDataSource> { SampleDataSourceImpl() }
}