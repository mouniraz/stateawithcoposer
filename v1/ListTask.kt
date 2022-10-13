package com.example.tasksdoing

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListTask(list:List<Task>)
{

        LazyColumn(modifier = Modifier.padding(all=8.dp))
        {items(list)
        { task-> ItemTask(task) } }


}