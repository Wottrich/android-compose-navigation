package wottrich.github.io.androidnavigationcompose.normalnavigation.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegisterNameViewModel: ViewModel() {

    var names: List<String> by mutableStateOf(listOf())
        private set

    fun addItems(item: String) {
        names = names + listOf(item)
    }

}