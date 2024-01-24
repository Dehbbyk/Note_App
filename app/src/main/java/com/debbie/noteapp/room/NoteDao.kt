package com.debbie.noteapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.debbie.noteapp.models.Note

@Dao
interface NoteDao {
    @Insert
    suspend fun saveNote(note: Note)

    @Query("select * from notes")
    fun fetchNotes(): LiveData<List<Note>>
}