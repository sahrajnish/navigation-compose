package com.example.navigationcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavPage(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    /*
    * NavHost() method takes 3 parameters.
    * 1. navController - passed from mainActivity.
    * 2. startDestination - Default Screen, or first screen.
    * 3. graph - which is a lambda method.
    * graph maps out all the screen and when to call them.
    */
    NavHost(
        navController = navController,
        startDestination = Routes.screenA //default screen
    ) {
        composable(Routes.screenA) {
            ScreenA(navController) //when Route is screenA it calls ScreenA() method.
        }
        composable(Routes.screenB) {
            ScreenB(navController)
        }
        composable(Routes.screenC) {
            ScreenC(navController)
        }
    }
}