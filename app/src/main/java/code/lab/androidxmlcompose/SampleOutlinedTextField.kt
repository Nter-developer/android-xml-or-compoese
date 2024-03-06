package code.lab.androidxmlcompose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun SampleOutlinedTextField() {
    var text by remember { mutableStateOf("This is outlined text field") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { (Text("Label")) },
        modifier = Modifier.fillMaxWidth()
    )
}