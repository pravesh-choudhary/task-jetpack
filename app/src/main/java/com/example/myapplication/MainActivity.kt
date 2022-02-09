package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.CustomChip
import com.example.myapplication.ui.theme.TopBarComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ScaffoldCompose()
        }
    }
}

@Composable
fun ScaffoldCompose(){
    Scaffold (
        topBar={TopBarComposable()},
        modifier = Modifier.background(Color(0xffffff)),
        bottomBar={ BottomNavBar()}
    ){
        Column(modifier = Modifier.fillMaxWidth()) {
            Chips()
            Column(modifier = Modifier.verticalScroll(rememberScrollState())
                .padding(bottom=60.dp)
            ){
            FeedItem()
            FeedItem()

            }
        }
    }
}

@Preview
@Composable
fun Chips() {
        Column {
            Row(modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)
                .horizontalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.padding(12.dp))
                CustomChip(
                    title = "सभी",
                    selected = false
                )
                Spacer(modifier = Modifier.padding(12.dp))
                CustomImageChip(
                    title = "ट्रेंडिंग",
                    imageId = R.drawable.ic_fire,
                    selected = false
                )

                Spacer(modifier = Modifier.padding(12.dp))
                CustomImageChip(
                    title = "सिटीमॉल",
                    imageId = R.drawable.ic_logo,
                    selected = false
                )
                Spacer(modifier = Modifier.padding(12.dp))
                CustomImageChip(
                    title = "इंस्पिरेशनल",
                    imageId = R.drawable.ic_inspection,
                    selected = false
                )
                Spacer(modifier = Modifier.padding(12.dp))
            }

        }

}
