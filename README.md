# stateWithcomposer
iin this workshop we will do with states in compose 
the purpose is to prepare this screen <br>
<img src="https://github.com/mouniraz/stateawithcoposer/blob/main/screentp1.png" height=400/>
## Steps1
in the composable InputAddComposer
replace 
```kotlin
var text by remember { mutableStateOf("") }
```
par
```kotlin
var text :String=""
```
what happen ? what does that mean this declaration? what is the type of the variable text?
## Steps2 

Replace this declaration by this
```kotlin
  //var text by remember { mutableStateOf("") }
    val textState = remember { mutableStateOf("") }

    Column(modifier= Modifier.padding(8.dp)) {
        OutlinedTextField(value = textState.value, onValueChange ={textState.value=it}, label = { Text("Task") },)
        .........
 ```
check the difference betweeen this declaration and the previous way
## Steps3
