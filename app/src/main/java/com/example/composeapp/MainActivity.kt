package com.example.composeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.SkipNext
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.ComposeAppTheme
import com.example.composeapp.ui.greenColor


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme(darkTheme = false) {
                Greeting()
            }
        }
    }
}


@Composable
private fun Greeting() {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        content = { UserInfo() }

    )

}

@Composable
@Preview
fun UserInfo() {
    Column {
        CustomAppBar()

        Box(
            contentAlignment = Alignment.Center,

            modifier = Modifier.weight(1f).background(color = Color.White).fillMaxWidth()
                .align(alignment = Alignment.CenterHorizontally),
        ) {
            Image(
                modifier = Modifier.height(200.dp).width(200.dp),
                painter = painterResource(R.drawable.ic_flower), contentDescription = ""
            )
        }
        Card(
            elevation = 5.dp,
            backgroundColor = greenColor,
            shape = RoundedCornerShape(20.dp),


            modifier = Modifier.weight(1f).fillMaxWidth().padding(20.dp),

            ) {

            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().height(60.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Aloe Vera",
                            style = TextStyle(color = Color.White, fontSize = 14.sp)
                        )
                        Text(
                            text = "Aloe Vera",
                            style = TextStyle(color = Color.White, fontSize = 8.sp)
                        )

                    }
                    OutlinedButton(
                        onClick = {},
                        shape = RoundedCornerShape(topEnd = 30.dp, bottomStart = 30.dp),
                        modifier = Modifier.width(100.dp).height(56.dp)
                    ) {
                        Text(text = "INR 25")

                    }
                }
                Text(
                    text = "Aloe vera, sometimes described as a “wonder plant,” is a short-stemmed shrub. Aloe is a genus that contains more than 500 species of flowering succulent plants. Many Aloes occur naturally in North Africa. The leaves of Aloe vera are succulent, erect, and form a dense rosette",
                    style = TextStyle(color = Color.White, fontSize = 12.sp)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),

                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.width(120.dp)
                    ) {
                        Text(text = "Add to Cart")

                    }

                    IconButton(
                        onClick = {},
                        modifier = Modifier.width(40.dp).background(color = Color.Green)
                    ) {

                        Icon(imageVector = Icons.Outlined.ArrowForward, contentDescription = "Back", tint = Color.White)

                    }
                }

            }


        }


    }


}

@Composable
fun CustomAppBar() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = {}) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Back")
        }

        IconButton(onClick = {}) {

            Icon(imageVector = Icons.Outlined.Favorite, contentDescription = "Back")
        }
    }
}

