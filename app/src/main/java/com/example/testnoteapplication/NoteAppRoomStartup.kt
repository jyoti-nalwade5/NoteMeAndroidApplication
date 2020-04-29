package com.example.testnoteapplication

import android.app.Application
import androidx.room.Room
import com.example.testnoteapplication.data.db.NotesAppDatabase

class NoteAppRoomStartup : Application() {

    companion object {
        var database: NotesAppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database =
            Room.databaseBuilder(applicationContext, NotesAppDatabase::class.java, "notes_db")
                .fallbackToDestructiveMigration().build()
    }
}