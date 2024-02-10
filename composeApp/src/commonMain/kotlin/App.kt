import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.FadeTransition
import presentation.screen.sample.SampleScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(screen = SampleScreen()) {
            FadeTransition(it)
        }
    }
}