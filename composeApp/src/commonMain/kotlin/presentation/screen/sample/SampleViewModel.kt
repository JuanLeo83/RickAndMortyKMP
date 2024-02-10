package presentation.screen.sample

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import domain.usecase.SampleUseCase
import kotlinx.coroutines.launch

class SampleViewModel(
    private val sampleUseCase: SampleUseCase
) : StateScreenModel<SampleState>(SampleState.Initial) {

    fun onButtonClicked() {
        screenModelScope.launch {
            mutableState.value = SampleState.Clicked
        }
    }

}