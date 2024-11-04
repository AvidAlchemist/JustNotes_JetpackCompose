package com.example.justnotes_jetpackcompose.core.data.source.local

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    fun getAllNotesFlow() : Flow<List<Note>>

    fun getNoteByIdFlow(id : Int) : Flow<Note>

    suspend fun addNote(note : Note)

    suspend fun updateNote(note : Note)

    suspend fun deleteNote(note: Note)

}