package com.example.justnotes_jetpackcompose.core.data.mapper

import com.example.justnotes_jetpackcompose.core.data.source.local.model.NoteEntity
import com.example.justnotes_jetpackcompose.core.domain.model.Note

fun NoteEntity.toNote() = Note(id,title,description)
fun Note.toNoteEntity() = NoteEntity(id,title,description)