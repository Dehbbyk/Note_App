package com.debbie.noteapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteDetailsScreen(NavController: NavController, noteId: String){
    Scaffold(
       topBar = {
           TopAppBar(
               title = { Text(text = "Note Details") },
               colors = TopAppBarDefaults.smallTopAppBarColors(
                   containerColor = MaterialTheme.colorScheme.primary,
                   titleContentColor = Color.White,
                   actionIconContentColor = Color.White
               ),
               actions = {
                   IconButton(onClick = {}){
                       Icon(
                           imageVector = Icons.Default.Edit,
                           contentDescription = "Edit note"
                       )
                   }
                   IconButton(onClick = {}){
                       Icon(
                           imageVector = Icons.Default.Delete,
                           contentDescription = "Delete note"
                       )
                   }
               }
           )
       }
    ){paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)){
            Text("Note title will appear here $noteId")
            Text("Note content will appear here")
        }

    }
}