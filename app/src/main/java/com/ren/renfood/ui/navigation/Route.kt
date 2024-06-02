package com.ren.renfood.ui.navigation

sealed class Route(

    val route: String
) {
    data object WelcomeScreen : Route(route = "welcome")
    data object HomeScreen : Route(route = "home")
    data object AppStartNavigation : Route(route = "appStartNavigation")

}