package com.debbie.noteapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.debbie.noteapp.screens.AddNoteScreen
import com.debbie.noteapp.screens.NoteDetailsScreen
import com.debbie.noteapp.screens.NoteListScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.NoteListRoute
    ){
        composable("note-list"){
            NoteListScreen(navController)
        }
        composable(Routes.AddNoteRoute){
            AddNoteScreen(navController)
        }
        composable(Routes.NoteDetails){
            NoteDetailsScreen(NavController = navController)
        }
    }
}

object Routes{
    val NoteListRoute = "note-list"
    val AddNoteRoute = "add-note"
    val NoteDetails = "note-details"
}

@Preview
@Composable
fun AppNavigationPreview(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        AppNavigation()
    }
}