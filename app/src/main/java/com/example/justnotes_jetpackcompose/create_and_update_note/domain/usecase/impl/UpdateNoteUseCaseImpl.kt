package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.UpdateNoteUseCase
import javax.inject.Inject

class UpdateNoteUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
) : UpdateNoteUseCase {

    override suspend operator fun invoke(note: Note) = localDataSourceRepository.updateNote(note)
}