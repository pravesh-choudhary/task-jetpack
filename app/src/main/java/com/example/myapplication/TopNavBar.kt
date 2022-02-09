package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Preview
@Composable
fun TopBarComposable() {
    TopAppBar(
        title = {
            Text(
                text="होम",
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                lineHeight = 27.sp,
                modifier = Modifier.padding(24.dp,0.dp,0.dp,0.dp),
                fontFamily = FontFamily(Font(R.font.poppins))
            )
        },
        navigationIcon = {
            Icon(
                Icons.Default.Menu, contentDescription = "This is home icon", modifier = Modifier.padding(
                PaddingValues(16.dp)
                ))

        },
        actions = {
            Image(
                painterResource(id = R.drawable.dummy_profile_pic), contentDescription = "This is home icon",
                modifier = Modifier
                    .padding(PaddingValues(16.dp))
                    .align(Alignment.Top)
                    .clip(CircleShape)
                    .size(32.dp)
            )

        },
        backgroundColor = Color.White,
    )


}