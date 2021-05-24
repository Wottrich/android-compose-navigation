package wottrich.github.io.androidnavigationcompose.normalnavigation.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

@Composable
fun DetailNameScreen(
    navBackStackEntry: NavBackStackEntry
) {
    val text = navBackStackEntry.arguments?.getString("value").orEmpty()
    Text(text = text)
}