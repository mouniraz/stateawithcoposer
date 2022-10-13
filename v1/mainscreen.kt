package com.example.tasksdoing

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable

@Composable
fun MainScreen()
{

    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = { Text("Tasks App") },)  },

        drawerContent = { Text(text = "drawerContent") },
        content = { Column {
            InputAddComposer()
            ListTask(tasks)

        }})

}