package com.example.justnotes_jetpackcompose.core.data.source.local.model

import androidx.compose.runtime.Composable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo val title : String,
    @ColumnInfo val description : String,
)
