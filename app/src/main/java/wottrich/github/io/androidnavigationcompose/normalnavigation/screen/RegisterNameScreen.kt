package wottrich.github.io.androidnavigationcompose.normalnavigation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import wottrich.github.io.androidnavigationcompose.normalnavigation.RegisterNameFlow

@Composable
fun RegisterNameScreen(
    navHostController: NavHostController,
    registerViewModel: RegisterNameViewModel = viewModel()
) {

    var textTyped by remember { mutableStateOf("") }

    Column {
        OutlinedTextField(
            value = textTyped,
            onValueChange = {
                textTyped = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                registerViewModel.addItems(textTyped)
                textTyped = ""
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Register name")
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            registerViewModel.names.forEach {
                nameItem(navHostController, it)
            }
        }
    }

}

private fun LazyListScope.nameItem(navHostController: NavHostController, name: String) {
    item {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .clickable { onNavigateToDetailScreen(name, navHostController) }
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = name
            )
        }
    }
}

private fun onNavigateToDetailScreen(
    value: String,
    navHostController: NavHostController
) {
    navHostController.navigate("${RegisterNameFlow.DetailNameProperties.route}/$value")
}