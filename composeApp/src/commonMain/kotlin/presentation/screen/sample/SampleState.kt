package presentation.screen.sample

sealed class SampleState(val viewData: SampleViewData = SampleViewData()) {
    data object Initial : SampleState()
    data object Clicked : SampleState(SampleViewData("Clicked"))
}