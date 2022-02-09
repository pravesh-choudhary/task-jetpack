package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeatureComponent(
    name:String,
    icon:Int,
    num:Int,
    modifier: Modifier,
    horizontalAlignment: Arrangement.Horizontal
){  Box(

){
    Column(modifier = modifier
        ,

    ) {
        Row(modifier = Modifier.height(24.dp)
            , verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painterResource(id = icon), contentDescription = "This is home icon",
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(text=num.toString(),
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 4.dp)
                ,
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                lineHeight = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                color= Color(0x8F000000),

                )
        }
        Row(horizontalArrangement = Arrangement.Center

            ){
            Text(text=name, modifier = Modifier.padding(start = 4.dp,top = 7.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                lineHeight = 18.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                color= Color(0x8F000000)

            )
        }

    }
}}