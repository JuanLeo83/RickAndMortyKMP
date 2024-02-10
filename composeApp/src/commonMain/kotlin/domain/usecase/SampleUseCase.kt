package domain.usecase

import domain.repository.SampleRepository

class SampleUseCase(private val sampleRepository: SampleRepository) {
    operator fun invoke() {
        sampleRepository.sampleFunction()
    }
}