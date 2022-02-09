package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommentBar(
    modifier: Modifier
) {
    var value by remember { mutableStateOf("") }
    Row(modifier = modifier
        .padding(top = 20.dp, start = 16.dp, end = 16.dp, bottom = 20.dp)
        .height(50.dp)
        .fillMaxWidth()
        .background(
            color = Color.White,
            shape = RoundedCornerShape(6.dp)
        )
        .border(1.dp, Color(0x33000000), RoundedCornerShape(6.dp))
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row(){
        Image(
            painterResource(id=R.drawable.dummy_profile_pic), contentDescription = "This is home icon",
            modifier = Modifier
                .size(45.dp)
                .align(Alignment.CenterVertically)
                .padding(start = 12.dp, top = 6.dp, bottom = 6.dp)
                .clip(CircleShape)
        )
            Text(modifier = Modifier.padding(top=12.dp,bottom=12.dp,start=9.dp)
                ,text="अपना कमेंट लिखें...",
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.mukta)),
                color= Color(0x8F000000)
                ,
                textAlign = TextAlign.Start
            )
        }

            Image(
                painterResource(id = R.drawable.ic_send),
                contentDescription = "This is home icon",
                modifier = Modifier
                    .size(45.dp)
                    .align(Alignment.CenterVertically)
                    .padding(start = 12.dp, end = 12.dp, bottom = 10.dp, top = 10.dp),

            )

    }
}

