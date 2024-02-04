package com.simpletext

import android.util.Log
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
    fontSize: Int = 20,
    marginLeft: Int = 0,
    marginRight: Int = 0,
    fontWeight: String = "normal",
    maxLength:Int = 0
){
    var definitiveTitle = title;

    if (maxLength > 0) {
       definitiveTitle =  title.take(maxLength - 3) + "..."
    }
    Text(text = definitiveTitle, style = TextStyle(color = color, fontSize = fontSize.sp, fontWeight = getFont(fontWeight)),
        modifier = Modifier.padding(start = marginLeft.dp, end = marginRight.dp))
}

fun getFont(fontWeight: String): FontWeight {

        if(fontWeight == "100"){
            return FontWeight.Thin
        }
        else  if(fontWeight == "200"){
            return FontWeight.ExtraLight
        }
        else  if(fontWeight == "300"){
            return FontWeight.Light
        }
        else  if(fontWeight == "400"){
            return FontWeight.Medium
        }
        else  if(fontWeight == "normal"){
            return FontWeight.Normal
        }
        else  if(fontWeight == "500"){
            return FontWeight.SemiBold
        }
        else  if(fontWeight == "bold"){
            return FontWeight.Bold
        }
    else {
            Log.e("App","Error: The value of fontWeight '$fontWeight' is not supported.")
            throw IllegalArgumentException("The value of fontWeight is not supported: $fontWeight")
        }
}



//Bold