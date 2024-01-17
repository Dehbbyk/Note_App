package com.debbie.noteapp.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.debbie.noteapp.models.Note
import com.debbie.noteapp.room.DatabaseConfig
import kotlinx.coroutines.launch

class NoteViewModel(var applicationn: Application): AndroidViewModel(applicationn){

    fun saveNote(title: String, content: String){
//        creating a note instance
        val note = Note(
            title = title,
            content = content
        )
//        calling the save function of the database
        var db = DatabaseConfig.getInstance(applicationn)
        viewModelScope.launch {
            db.noteDao().saveNote(note)
        }
    }
}