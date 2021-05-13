package wottrich.github.io.androidnavigationcompose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import wottrich.github.io.androidnavigationcompose.ui.AndroidNavigationComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val context = LocalContext.current
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Normal Navigation")
        }

        Button(
            onClick = {
                Toast.makeText(context, "Work in progress", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "Bottom Bar Navigation [WIP]")
        }
    }
}

private fun startNormalNavigationFlow(context: Context) {
    context.startActivity(Intent())
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidNavigationComposeTheme {
        Greeting("Android")
    }
}