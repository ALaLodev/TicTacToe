package com.alalodev.tictactoe.ui.home

import androidx.lifecycle.ViewModel
import com.alalodev.tictactoe.data.network.FirebaseService
import com.alalodev.tictactoe.data.network.model.GameData
import com.alalodev.tictactoe.data.network.model.PlayerData
import com.alalodev.tictactoe.ui.core.Routes
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val firebaseService: FirebaseService):ViewModel() {

    fun onCreateGame() {
        val gameId = firebaseService.createGame(createNewGame())
    }

    private fun createNewGame(): GameData{
        val currentPlayer = PlayerData(playerType = 1)
        return GameData(
            board = List(9){0},
            player1 = currentPlayer,
            playerTurn = currentPlayer,
            player2 = null
        )
    }

    fun onJoinGame(id: String) {

    }

}