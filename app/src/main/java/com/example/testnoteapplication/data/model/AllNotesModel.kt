package com.example.testnoteapplication.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "AllNotes")
data class AllNotesModel(

    @PrimaryKey(autoGenerate = true)
    var noteId: Int,
    var noteTitle: String,
    var noteDescription: String,
    var noteType: String,
    var createdOn: String


)