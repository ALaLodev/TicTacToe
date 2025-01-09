package com.alalodev.tictactoe.ui.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alalodev.tictactoe.ui.core.Routes.*
import com.alalodev.tictactoe.ui.game.GameScreen
import com.alalodev.tictactoe.ui.home.HomeScreen

@Composable
fun ContentWrapper(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = "home") {
        composable(Home.routes) { HomeScreen(navigateToGame = {navigationController.navigate(Game.routes)}) }
        composable(Game.routes) { GameScreen() }
    }
}

sealed class Routes(val routes: String){
    object Home:Routes("home")
    object Game:Routes("game")
}