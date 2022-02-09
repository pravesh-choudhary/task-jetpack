package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeedItem(){
    Column() {
        Divider(color = Color(0xFFF4F4F4), thickness = 8.dp)

            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
                    .padding(end=16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(){
                Image(
                    painterResource(id = R.drawable.dummy_profile_pic),
                    contentDescription = "This is home icon",
                    modifier = Modifier
                        .padding(start = 16.dp, bottom = 12.dp, top = 16.dp)
                        .clip(CircleShape)
                        .size(48.dp)
                )
                Column() {
                    Text(
                        text = "अमित कुमार | डायरेक्टर",
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(600),
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        modifier = Modifier.padding(top = 16.dp, start = 10.dp)
                    )
                    Text(
                        text = "रेवाड़ी • १५ मिनट ",
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                        lineHeight = 20.sp,
                        modifier = Modifier.padding(top = 2.dp, start = 10.dp),
                        color = Color(0x8F000000)
                    )

                }
                }

                OutlinedButton(onClick = { /*TODO*/ },
                    shape= RoundedCornerShape(6.dp),
                    border = BorderStroke(1.dp,Color(0xFFE40046)),
                    modifier = Modifier.width(81.dp).height(32.dp)
                ){
                    Row(

                    ){
                        Icon(
                            Icons.Default.Add,
                            contentDescription = "This is home icon",
                            modifier = Modifier,
                            tint = Color(0xffE40046)
                        )
                    Text(text="फॉलो", textAlign = TextAlign.Center,color=Color(0xffE40046)
                        , fontFamily = FontFamily(Font(R.font.poppins))
                        , fontSize = 12.sp,
                        fontWeight = FontWeight(600),
                    )
                    }
                }

        }
        Row(){
        Text(text = "“हमेशा खुद में होंसला रखो”\n मैंने अपने आप में होंसला रखा और मेहनत के दम पर आज मैं अपने परिवार का कल बेहतर करने में समर्थ हूँ |",
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            lineHeight = 22.sp,
            fontFamily = FontFamily(Font(R.font.poppins))
        )}
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(205.dp)

        ){
            Image(
                painterResource(id = R.drawable.dummy_img), contentDescription = "This is home icon",
                modifier = Modifier
                    .padding(top = 12.dp)
                    .fillMaxSize()
            )
        }
        
        Row( modifier = Modifier
            .padding(top = 15.dp)
            .fillMaxWidth(
            ),
            horizontalArrangement = Arrangement.SpaceEvenly
            ){

            FeatureComponent(
                name = "लाइक्स ", icon = R.drawable.ic_like_deselected, num = 421,
                modifier =Modifier, horizontalAlignment = Arrangement.Start)
            FeatureComponent(name = "कमेंट्स ", icon = R.drawable.ic_deselected_comment, num = 62, modifier = Modifier, horizontalAlignment = Arrangement.End)
            FeatureComponent(name = "शेयर करें  ", icon = R.drawable.ic_deselected_share, num = 62, modifier = Modifier, horizontalAlignment = Arrangement.End)

        }
        CommentBar(modifier = Modifier.fillMaxWidth())
    }
}

