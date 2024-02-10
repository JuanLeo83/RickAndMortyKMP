package di

import org.koin.dsl.module
import presentation.screen.sample.SampleViewModel

val commonPresentationModule = module {
    factory { SampleViewModel(get()) }
}