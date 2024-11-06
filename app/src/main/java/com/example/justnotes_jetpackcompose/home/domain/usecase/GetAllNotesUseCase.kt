package com.example.justnotes_jetpackcompose.home.domain.usecase

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface GetAllNotesUseCase {

    operator fun invoke() : Flow<List<Note>>

}