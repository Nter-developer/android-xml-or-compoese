package code.lab.androidxmlcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        SampleTextField()
        SampleOutlinedTextField()
    }
}