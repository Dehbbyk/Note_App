package com.debbie.noteapp.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.debbie.noteapp.models.Note
import com.debbie.noteapp.room.DatabaseConfig
import kotlinx.coroutines.launch

class NoteViewModel(var applicationn: Application): AndroidViewModel(applicationn){
// calling the save function of the database
    private val db = DatabaseConfig.getInstance(applicationn)
    fun saveNote(title: String, content: String){
//        creating a note instance
        val note = Note(
            title = title,
            content = content
        )
//        calling the save function of the database
        viewModelScope.launch {
            db.noteDao().saveNote(note)
        }
    }

        fun getAllNotes(): LiveData<List<Note>> {
        return db.noteDao().fetchNotes()
    }
}