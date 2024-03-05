package code.lab.androidxmlcompose

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import code.lab.androidxmlcompose.ui.theme.AndroidXMLComposeTheme

class MainActivity : ComponentActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View binding for xml layout
        setContentView(R.layout.layout_main)
        /* setContent {
            AndroidXMLComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        } */

        editText = findViewById(R.id.edittext_sample)
    }
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