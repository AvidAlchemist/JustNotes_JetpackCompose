package com.example.justnotes_jetpackcompose.home.domain.impl

import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import com.example.justnotes_jetpackcompose.home.domain.GetAllNotesUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotesUseCaseImpl @Inject constructor(
    private val localDataSourceRepository: LocalDataSourceRepository
) : GetAllNotesUseCase {
    override fun invoke(): Flow<List<Note>> = localDataSourceRepository.getAllNotesFlow()
}