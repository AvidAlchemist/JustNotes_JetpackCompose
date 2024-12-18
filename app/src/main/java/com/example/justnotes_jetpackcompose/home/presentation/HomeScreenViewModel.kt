package com.example.justnotes_jetpackcompose.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.justnotes_jetpackcompose.core.domain.model.Note
import com.example.justnotes_jetpackcompose.home.domain.usecase.DeleteNoteUseCase
import com.example.justnotes_jetpackcompose.home.domain.usecase.GetAllNotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

internal sealed interface HomeScreenUiEvent {
    data class OnDeleteClick(val note : Note) : HomeScreenUiEvent
}

internal sealed interface HomeScreenUiState {

    data object Empty : HomeScreenUiState
    data class Content(val notes : List<Note>) : HomeScreenUiState
}

@HiltViewModel
internal class HomeViewModel @Inject constructor(
    private val deleteNoteUseCase : DeleteNoteUseCase,
    getAllNotesUseCase: GetAllNotesUseCase,
) : ViewModel() {

    fun handleEvent(event : HomeScreenUiEvent) {
        when (event) {
            is HomeScreenUiEvent.OnDeleteClick -> deleteNote(event.note)
        }
    }

    private val notes = getAllNotesUseCase()

    val uiState : StateFlow<HomeScreenUiState> = notes.map { notesList ->
        if(notesList.isNotEmpty())
            HomeScreenUiState.Content(notesList)
        else HomeScreenUiState.Empty
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = HomeScreenUiState.Empty
    )

    private fun deleteNote(note : Note) {
        viewModelScope.launch(Dispatchers.IO) {
            deleteNoteUseCase(note)
        }
    }
}
