package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.gonutswithdonuts.ui.theme.inter


@Composable
fun DonutsDetailsQuantityGroup(){
    Row {
        QuantityButton(White, Black, "-")
        Spacer(Modifier.width(20.dp))
        QuantityButton(White, Black, "1")
        Spacer(Modifier.width(20.dp))
        QuantityButton(Black, White, "+")
    }
}

@Composable
private fun QuantityButton(backgroundColor: Color, textColor: Color, text: String){
    Row {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(45.dp)
                .shadow(0.5.dp, shape = RoundedCornerShape(10.dp),clip = false)
                .background(color = backgroundColor, shape = RoundedCornerShape(10.dp))
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                color = textColor,
                fontSize = 32.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DonutsDetailsQuantityGroupPreview(){
    DonutsDetailsQuantityGroup()
}
