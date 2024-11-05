package com.example.justnotes_jetpackcompose.home.di

import com.example.justnotes_jetpackcompose.home.domain.DeleteNoteUseCase
import com.example.justnotes_jetpackcompose.home.domain.GetAllNotesUseCase
import com.example.justnotes_jetpackcompose.home.domain.impl.DeleteNoteUseCaseImpl
import com.example.justnotes_jetpackcompose.home.domain.impl.GetAllNotesUseCaseImpl
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

    abstract fun bindGetAllNotesUseCase(
        getAllNotesUseCaseImpl: GetAllNotesUseCaseImpl
    ) : GetAllNotesUseCase
}