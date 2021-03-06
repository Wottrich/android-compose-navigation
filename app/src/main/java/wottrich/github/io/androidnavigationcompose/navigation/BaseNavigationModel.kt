package wottrich.github.io.androidnavigationcompose.navigation

import androidx.navigation.compose.NamedNavArgument
import java.util.*

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
    val routeWithArgument: String
    val arguments: List<NamedNavArgument>
    val titleRes: Int?
}

abstract class BaseNavigationModelImpl(
    override val route: String,
    override val routeWithArgument: String = route,
    override val arguments: List<NamedNavArgument> = emptyList(),
    override val titleRes: Int? = null
) : BaseNavigationModel