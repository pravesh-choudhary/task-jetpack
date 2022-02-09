package com.example.myapplication.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun CustomChip(
    title: String,
    selected: Boolean
) {
    Surface(
        color = when {
            selected -> Color(0xFFE40046)
            else -> Color(0x0D000000)
        },
        contentColor = when {
            selected -> Color.White
            else -> Color(0x0D000000)
        },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(
            width = 1.dp,
            color = when {
                selected -> Color(R.color.pink_primary)
                else -> Color.Transparent
            }
        ), modifier = Modifier.height(32.dp)

    ) {

        Row(modifier = Modifier) {

            Text(
                text = title,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(500),
                fontSize = 14.sp,
                lineHeight = 20.sp,
                modifier = Modifier
                    .padding(end = 16.dp, top = 6.dp, bottom = 6.dp, start = 16.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxHeight(),

                )
        }
    }
}