package code.lab.androidxmlcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import code.lab.androidxmlcompose.ui.theme.AndroidXMLComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View binding for xml layout
        // setContentView(R.layout.layout_main)
        setContent {
            AndroidXMLComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        SampleTextField()
                        SampleOutlinedTextField()
                    }

                }
            }
        }
    }
}

@Composable
fun SampleTextField() {
    var text by remember { mutableStateOf("This is text field") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { (Text("Label")) },
        modifier = Modifier.fillMaxWidth())
}

@Composable
fun SampleOutlinedTextField() {
    var text by remember { mutableStateOf("This is outlined text field") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { (Text("Label")) },
        modifier = Modifier.fillMaxWidth())
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidXMLComposeTheme {
        Greeting("Android")
    }
}