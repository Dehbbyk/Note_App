package com.debbie.noteapp.components

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

@Composable
fun NoteItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                //.align(Alignment.End)
        ){
            Text(
                text = "Title of the note",
                fontWeight = FontWeight.Black
            )
            Text(text = "Content of the note will be here as Debbie's book of records")
            Text(
                text = "21:41",
                fontStyle = FontStyle.Normal,
                //modifier = Modifier
                    //.padding(top = 8.dp, end = 8.dp)
            )
        }
    }
}