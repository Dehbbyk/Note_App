package com.debbie.noteapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.debbie.noteapp.Routes
import com.debbie.noteapp.models.Note

@Composable
fun NoteItem(note: Note, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { navController.navigate(Routes.NoteDetails) }
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                //.align(Alignment.End)
        ){
            Text(
                text = note.title,
                fontWeight = FontWeight.Black
            )
            Text(text = note.content)
        }
    }
}