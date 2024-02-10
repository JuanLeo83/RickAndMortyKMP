import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.commonDataModule
import di.commonDomainModule
import di.commonPresentationModule
import org.koin.core.context.startKoin

fun main() = application {
    initKoin()

    Window(onCloseRequest = ::exitApplication, title = "RickAndMortyKMP") {
        App()
    }
}

private fun initKoin() {
    startKoin {
        modules(
            commonDataModule,
            commonDomainModule,
            commonPresentationModule
        )
    }
}