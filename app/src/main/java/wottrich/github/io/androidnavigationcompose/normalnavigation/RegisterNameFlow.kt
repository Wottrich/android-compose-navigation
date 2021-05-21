package wottrich.github.io.androidnavigationcompose.normalnavigation

import wottrich.github.io.androidnavigationcompose.navigation.BaseNavigationModelImpl

object RegisterNameFlow {

    object RegisterNameProperties : BaseNavigationModelImpl(
        route = "registerNameFlow/registerName",
        destinations = mapOf(
            DetailNameProperties.route to DetailNameProperties
        )
    )

    object DetailNameProperties: BaseNavigationModelImpl(
        route = "registerNameFlow/detailName"
    )

}