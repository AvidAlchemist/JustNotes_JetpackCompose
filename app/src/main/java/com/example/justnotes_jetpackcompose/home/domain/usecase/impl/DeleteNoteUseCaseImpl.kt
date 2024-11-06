package com.example.justnotes_jetpackcompose.home.domain.usecase.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.home.domain.usecase.DeleteNoteUseCase
import javax.inject.Inject

class DeleteNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository : LocalDataSourceRepository
) : DeleteNoteUseCase {

    override suspend operator fun invoke(note: Note) {
        localDataSourceRepository.deleteNote(note)
    }
}