package com.example.justnotes_jetpackcompose.core.data.source.local.di

import android.content.Context
import androidx.room.Room
import com.example.justnotes_jetpackcompose.core.data.repository.LocalDataSourceRepositoryImpl
import com.example.justnotes_jetpackcompose.core.data.source.local.LocalDataSource
import com.example.justnotes_jetpackcompose.core.data.source.local.RoomLocalDataSource
import com.example.justnotes_jetpackcompose.core.data.source.local.db.NotesRoomDatabase
import com.example.justnotes_jetpackcompose.core.domain.repository.LocalDataSourceRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalSourceModuleProvider {

    @Provides
    fun provideNoteDao(database: NotesRoomDatabase) = database.noteDao()

    @Provides
    @Singleton
    fun providesLocalDatabase(
        @ApplicationContext context : Context
    ) = Room.databaseBuilder(
        context,
        NotesRoomDatabase::class.java,
        "just_notes-database"
    ).build()
}

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalSourceModuleBinder {

    @Binds
    abstract fun bindLocalDataSource(
        roomLocalDataSource : RoomLocalDataSource
    ) : LocalDataSource

    @Binds
    abstract fun bindDefaultJustNotesRepository(
        defaultJustNotesRepository: LocalDataSourceRepositoryImpl
    ) : LocalDataSourceRepository
}