package di

import domain.usecase.SampleUseCase
import org.koin.dsl.module

val commonDomainModule = module {
    single { SampleUseCase(get()) }
}