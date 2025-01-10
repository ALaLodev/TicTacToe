package com.alalodev.tictactoe.data.network

import com.alalodev.tictactoe.data.network.model.GameData
import com.google.firebase.database.DatabaseReference
import javax.inject.Inject

class FirebaseService @Inject constructor(private val reference: DatabaseReference) {

    companion object {
        private const val PATH = "games"
    }

    fun createGame(gameData: GameData): String {
        val gameReference = reference.child(PATH).push()
        val key = gameReference.key // Obtener la referencia de la partida
        val newGame = gameData.copy(gameId = key) //Modifica el modelo de dato insertando un valor en el id de partida
        gameReference.setValue(newGame)
        return newGame.gameId.orEmpty()
    }
}