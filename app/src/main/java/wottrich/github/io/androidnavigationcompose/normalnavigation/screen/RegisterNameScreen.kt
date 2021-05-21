package wottrich.github.io.androidnavigationcompose.normalnavigation.screen

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import wottrich.github.io.androidnavigationcompose.normalnavigation.RegisterNameFlow


@Composable
fun RegisterNameScreen(
    navHostController: NavHostController
) {
    Button(
        onClick = {
            //TODO add navigation
            //navHostController.navigate("${RegisterNameFlow.DetailNameProperties.route}/lucas")
        }
    ) {
        Text(text = "Just for test")
    }

}