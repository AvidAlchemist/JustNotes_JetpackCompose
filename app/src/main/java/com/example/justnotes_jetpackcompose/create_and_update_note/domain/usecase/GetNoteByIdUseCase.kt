package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface GetNoteByIdUseCase {
    operator fun invoke(id : Int) : Flow<Note>
}