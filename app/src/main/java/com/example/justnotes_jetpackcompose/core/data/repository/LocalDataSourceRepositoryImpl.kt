package com.example.justnotes_jetpackcompose.core.data.repository

import com.example.justnotes_jetpackcompose.core.data.source.local.LocalDataSource
import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSourceRepositoryImpl @Inject constructor(
    private val localDataSource : LocalDataSource,
) : LocalDataSourceRepository {
    override fun getAllNotesFlow() = localDataSource.getAllNotesFlow()

    override fun getNoteByIdFlow(id: Int): Flow<Note> = localDataSource.getNoteByIdFlow(id)

    override suspend fun addNote(note: Note) = localDataSource.addNote(note)

    override suspend fun updateNote(note: Note) = localDataSource.updateNote(note)

    override suspend fun deleteNote(note: Note) = localDataSource.deleteNote(note)
}