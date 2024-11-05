package com.example.justnotes_jetpackcompose.home.domain

import com.example.justnotes_jetpackcompose.core.domain.model.Note

interface DeleteNoteUseCase {

    suspend operator fun invoke(note : Note)

}