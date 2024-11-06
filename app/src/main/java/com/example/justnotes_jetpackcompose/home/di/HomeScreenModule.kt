package com.example.justnotes_jetpackcompose.home.di

import com.example.justnotes_jetpackcompose.home.domain.usecase.DeleteNoteUseCase
import com.example.justnotes_jetpackcompose.home.domain.usecase.GetAllNotesUseCase
import com.example.justnotes_jetpackcompose.home.domain.usecase.impl.DeleteNoteUseCaseImpl
import com.example.justnotes_jetpackcompose.home.domain.usecase.impl.GetAllNotesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeScreenModule {

    @Binds
    abstract fun bindDeleteNoteUseCase(
        deleteNoteUseCaseImpl: DeleteNoteUseCaseImpl
    ) : DeleteNoteUseCase

    @Binds
    abstract fun bindGetAllNotesUseCase(
        getAllNotesUseCaseImpl: GetAllNotesUseCaseImpl
    ) : GetAllNotesUseCase
}