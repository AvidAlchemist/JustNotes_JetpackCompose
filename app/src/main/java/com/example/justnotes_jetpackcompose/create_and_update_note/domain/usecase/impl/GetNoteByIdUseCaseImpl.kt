package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.GetNoteByIdUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNoteByIdUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
) : GetNoteByIdUseCase {
    override fun invoke(id: Int): Flow<Note> = localDataSourceRepository.getNoteByIdFlow(id)
}