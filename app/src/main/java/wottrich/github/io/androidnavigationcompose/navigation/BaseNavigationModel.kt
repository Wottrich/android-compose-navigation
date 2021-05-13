package wottrich.github.io.androidnavigationcompose.navigation

import androidx.navigation.compose.NamedNavArgument

/**
 * @author Wottrich
 * @author wottrich78@gmail.com
 * @since 12/05/2021
 *
 * Copyright © 2021 AndroidNavigationCompose. All rights reserved.
 *
 */

interface BaseNavigationModel {
    val route: String
    val arguments: List<NamedNavArgument>
        get() = emptyList()
    val titleRes: Int?
        get() = null
}