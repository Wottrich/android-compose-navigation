package wottrich.github.io.androidnavigationcompose.normalnavigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NamedNavArgument
import wottrich.github.io.androidnavigationcompose.R
import wottrich.github.io.androidnavigationcompose.navigation.BaseNavigationModel

/**
 * @author Wottrich
 * @author wottrich78@gmail.com
 * @since 12/05/2021
 *
 * Copyright © 2021 AndroidNavigationCompose. All rights reserved.
 *
 */

class NormalNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //TODO implement compose navigation here
        }
    }

}

sealed class NormalNavigationScreens(
    override val route: String,
    override val arguments: List<NamedNavArgument> = emptyList(),
    override val titleRes: Int? = null
) : BaseNavigationModel {

    object NormalNavigationScreen : NormalNavigationScreens(
        route = NormalNavigationRoutes.startDestination,
        titleRes = R.string.normal_navigation_title_screen
    )

    object TypedValueScreen : NormalNavigationScreens(
        route = "${NormalNavigationRoutes.typedValueDestination}/{value}",
        titleRes = R.string.normal_navigation_title_screen
    ) {
        fun buildRouteWithArgument(value: String): String {
            return "${NormalNavigationRoutes.typedValueDestination}/$value"
        }
    }

    companion object {
        val screens = listOf(
            NormalNavigationScreen,
            TypedValueScreen
        )
    }

}

object NormalNavigationRoutes {
    const val startDestination = "normal/navigation"
    const val typedValueDestination = "$startDestination/detail"
}