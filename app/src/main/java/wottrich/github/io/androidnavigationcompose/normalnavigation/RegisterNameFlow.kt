package wottrich.github.io.androidnavigationcompose.normalnavigation

import androidx.navigation.NavType
import androidx.navigation.compose.navArgument
import wottrich.github.io.androidnavigationcompose.navigation.BaseNavigationModelImpl

object RegisterNameFlow {

    object RegisterNameProperties : BaseNavigationModelImpl(
        route = "registerNameFlow/registerName"
    )

    object DetailNameProperties : BaseNavigationModelImpl(
        route = "registerNameFlow/detailName",
        arguments = listOf(
            navArgument("value") { type = NavType.StringType }
        )
    ) {
        override val routeWithArgument: String
            get() = "$route/{value}"
    }

}