 package com.debbie.noteapp.screens

import android.provider.ContactsContract.CommonDataKinds.Note
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.debbie.noteapp.view_model.NoteViewModel

 @OptIn(ExperimentalMaterial3Api::class)
 @Composable
 fun AddNoteScreen(navController: NavController) {
     val noteViewModel: NoteViewModel = viewModel()
     var title by rememberSaveable { mutableStateOf("")}
     var content by rememberSaveable { mutableStateOf("")}

     Scaffold(
         topBar = {
             TopAppBar(
                 title = { Text(text = "Add New Note") },
                 colors = TopAppBarDefaults.smallTopAppBarColors(
                     containerColor = MaterialTheme.colorScheme.primary,
                     titleContentColor = Color.White,
                     actionIconContentColor = Color.White,
                     navigationIconContentColor = Color.White
                 ),
                 navigationIcon = {
                     IconButton(
                         onClick = {
//                             saves the note
                             noteViewModel.saveNote(title,content)
//                             takes user back
                             navController.popBackStack()
                         }){
                         Icon(
                             imageVector = Icons.Default.ArrowBack,
                             contentDescription = "Back Button"
                         )
                     }
                 }
             )
         },
         content = { paddingValues ->
             Column(
                 modifier = Modifier
                     .padding(paddingValues)
                     .padding(all = 10.dp)
                     .fillMaxSize()
             ) {
                 OutlinedTextField(
                     modifier = Modifier
                         .fillMaxWidth(),
                     value = title,
                     onValueChange = { value -> title = value },
                     label = { Text(text = "Note Title", fontWeight = FontWeight.Black,) },
                 )
                 TextField(
                     value = content,
                     onValueChange = { value -> content = value },
                     label = { Text(text = "Note Content", fontWeight = FontWeight.Black,) },
                     modifier = Modifier
                         .fillMaxWidth()
                 )
             }
         }
     )
 }
@Preview
@Composable
fun AddNoteScreenPreview(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
//        AddNoteScreen(navController = NavController)
    }
}