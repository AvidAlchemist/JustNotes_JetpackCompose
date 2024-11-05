package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase

import com.example.justnotes_jetpackcompose.core.domain.model.Note

interface UpdateNoteUseCase {
    suspend operator fun invoke(note : Note)
}