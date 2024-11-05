package com.example.justnotes_jetpackcompose.create_and_update_note.di

import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.AddNoteUseCase
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.GetNotByIdUseCase
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.UpdateNoteUseCase
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl.AddNoteUseCaseImpl
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl.GetNoteByIdUseCaseImpl
import com.example.justnotes_jetpackcompose.create_and_update_note.domain.usecase.impl.UpdateNoteUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CreateAndUpdateNoteDomainModule {

    @Binds
    abstract fun bindAANoteUseCase(
        addNoteUseCaseImpl: AddNoteUseCaseImpl
    ) : AddNoteUseCase

    @Binds
    abstract fun bindGetNoteByIdUseCase(
        getNoteByIdUseCaseImpl: GetNoteByIdUseCaseImpl
    ) : GetNotByIdUseCase

    @Binds
    abstract fun bindUpdateNoteUseCase(
        updateNoteUseCaseImpl: UpdateNoteUseCaseImpl
    ) : UpdateNoteUseCase
}