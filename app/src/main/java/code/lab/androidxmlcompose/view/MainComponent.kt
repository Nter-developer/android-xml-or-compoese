package code.lab.androidxmlcompose.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainComponent(name: String, script: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .border(
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Black
                )
            )
            .clickable(onClick = { })
            .padding(12.dp)

    ) {
        Text(text = name)
        Text(text = script)
    }
}