package com.example.tasksdoing

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable
fun ItemTask(task:Task)
{

    Row(modifier= Modifier.fillMaxWidth())
    {
        task.label.let { Text(it, modifier = Modifier.align(alignment = Alignment.CenterVertically)) }
        Spacer(modifier = Modifier.width(4.dp))
        Row(horizontalArrangement = Arrangement.End)
        {
            Checkbox(checked = task.checked, onCheckedChange ={ })
            Spacer(modifier = Modifier.width(4.dp))
            IconButton(onClick = {},) {
                Icon(Icons.Filled.Close, contentDescription = "Close")

            }
        }


    }
}