package wottrich.github.io.androidnavigationcompose.normalnavigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import wottrich.github.io.androidnavigationcompose.normalnavigation.screen.DetailNameScreen
import wottrich.github.io.androidnavigationcompose.normalnavigation.screen.RegisterNameScreen
import wottrich.github.io.androidnavigationcompose.ui.AndroidNavigationComposeTheme

/**
 * @author Wottrich
 * @author wottrich78@gmail.com
 * @since 12/05/2021
 *
 * Copyright © 2021 AndroidNavigationCompose. All rights reserved.
 *
 */

class RegisterNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationComposeTheme {
                val navHostController = rememberNavController()
                Scaffold(
                    topBar = { TopAppBarContent() }
                ) {
                    AppNavigator(navHostController = navHostController)
                }
            }
        }
    }

    @Composable
    private fun TopAppBarContent() {
        TopAppBar(
            title = {
                Text(text = "Tela dos nomes")
            },
            navigationIcon = {
                IconButton(onClick = { super.onBackPressed() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Voltar"
                    )
                }
            }
        )
    }

    @Composable
    private fun AppNavigator(navHostController: NavHostController) {
        NavHost(
            navController = navHostController,
            startDestination = RegisterNameFlow.RegisterNameProperties.route,
            builder = {
                composable(RegisterNameFlow.RegisterNameProperties.route) {
                    RegisterNameScreen(navHostController = navHostController)
                }
                composable(RegisterNameFlow.DetailNameProperties.route) {
                    DetailNameScreen(navHostController = navHostController)
                }
            }
        )
    }

}

//sealed class NormalNavigationScreens(
//    override val route: String,
//    override val arguments: List<NamedNavArgument> = emptyList(),
//    override val titleRes: Int? = null
//) : BaseNavigationModel {
//
//    object NormalNavigationScreen : NormalNavigationScreens(
//        route = NormalNavigationRoutes.startDestination,
//        titleRes = R.string.normal_navigation_title_screen
//    )
//
//    object TypedValueScreen : NormalNavigationScreens(
//        route = "${NormalNavigationRoutes.typedValueDestination}/{value}",
//        titleRes = R.string.normal_navigation_title_screen
//    ) {
//        fun buildRouteWithArgument(value: String): String {
//            return "${NormalNavigationRoutes.typedValueDestination}/$value"
//        }
//    }
//
//    companion object {
//        val screens = listOf(
//            NormalNavigationScreen,
//            TypedValueScreen
//        )
//    }
//
//}
//
//object NormalNavigationRoutes {
//    const val startDestination = "normal/navigation"
//    const val typedValueDestination = "$startDestination/detail"
//}