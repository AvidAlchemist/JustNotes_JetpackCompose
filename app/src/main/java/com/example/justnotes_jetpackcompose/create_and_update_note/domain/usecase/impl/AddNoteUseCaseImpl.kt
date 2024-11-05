package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.AddNoteUseCase
import javax.inject.Inject

class AddNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository : LocalDataSourceRepository
) : AddNoteUseCase {
    override suspend fun invoke(note: Note) {
        localDataSourceRepository.addNote(note)
    }
}