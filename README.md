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
tape a text in the textfield and change orientation what happen ?
use this declaration and do the same operation
```kotlin
var text by rememberSaveable { mutableStateOf("") }
```
## Steps4
in the same screen what does the var that must be declared as State ?

## Steps5
in this step we will change list<Task> as State 
the difference between text and list that the list and the event that change the list are not in the same composable
 for text the event onchangetext and var text are in the same composable
  1.Declare a class called TasksViewModel qui herite de la classe ViewModel()
  
  ```kotlin
  class TaskViewModel: ViewModel() {}
  ```
  2. in this class declare the state that manage the list of tasks
  ```kotlin
      var listTask = mutableStateListOf<Task>()
  ```
  3. in the same class add the method addtask as below
    
  ```kotlin
  fun addTask(task:Task)
    {
        listTask.add(task)
    }
   ```
   4. pass this class as parameter in the composable that need to use the state or update the state 
    ```kotlin
      fun ListTasks(vm:TaskViewModel)
      fun ItemTask(task:Task,vm:TaskViewModel)
        
    ```
    change the rest of this classes to perform adding tasks and displaying them
  5. instantiate a var vm in the main scaffold 
      var vm:TaskViewModel= viewModel()
  and pass it as parameter in your composables
  6 add the method removeTask to your viewModel 
  7. the same with checkTask 
  
