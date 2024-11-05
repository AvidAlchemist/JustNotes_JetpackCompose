package com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase

import com.example.justnotes_jetpackcompose.core.domain.model.Note

interface AddNoteUseCase {
    suspend operator fun invoke(note : Note)
}