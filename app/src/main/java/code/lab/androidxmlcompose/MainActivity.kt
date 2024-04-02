package code.lab.androidxmlcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import code.lab.androidxmlcompose.view.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View binding for xml layout
        // setContentView(R.layout.layout_main)
        setContent {
            MainScreen()
        }
    }
}