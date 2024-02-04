package com.simpletext

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun SimpleText(
    title: String = "hello world",
    color: Color = Color.Black,
    fontSize: TextUnit = 20.sp,
    marginLeft: Dp = 0.dp,
    marginRight: Dp = 0.dp,
    fontWeight: FontWeight = FontWeight.Normal,
    maxLength:Int = 0
){
    var definitiveTitle = title;

    if (maxLength > 0) {
       definitiveTitle =  title.take(maxLength - 3) + "..."
    }

    Text(text = definitiveTitle, style = TextStyle(color = color, fontSize = fontSize, fontWeight = fontWeight),
        modifier = Modifier.padding(start = marginLeft, end = marginRight))
}