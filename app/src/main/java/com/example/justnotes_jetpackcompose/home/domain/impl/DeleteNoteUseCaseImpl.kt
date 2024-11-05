package com.example.justnotes_jetpackcompose.home.domain.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.home.domain.DeleteNoteUseCase
import javax.inject.Inject

class DeleteNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository : LocalDataSourceRepository
) : DeleteNoteUseCase {

    override suspend fun invoke(note: Note) {
        localDataSourceRepository.deleteNote(note)
    }
}