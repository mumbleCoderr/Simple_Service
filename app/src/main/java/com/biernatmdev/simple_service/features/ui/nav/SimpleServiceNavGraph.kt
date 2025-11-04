package com.biernatmdev.simple_service.features.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.biernatmdev.simple_service.features.splash.SplashScreen

@Composable
fun SimpleServiceNavGraph(startDestination: Screen = Screen.SplashScreen) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Screen.SplashScreen> {
            SplashScreen()
        }
    }
}