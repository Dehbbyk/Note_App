package com.debbie.noteapp.room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface NoteDao {
    @Insert
    fun saveNote(note: com.debbie.noteapp.models.Note)
}