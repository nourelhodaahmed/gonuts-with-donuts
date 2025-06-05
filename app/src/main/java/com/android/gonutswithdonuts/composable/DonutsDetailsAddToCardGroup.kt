package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.inter


@Composable
fun DonutsDetailsAddToCardGroup(){
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = "£16",
            textAlign = TextAlign.Center,
            color = Black,
            fontSize = 30.sp,
            fontFamily = inter,
            fontWeight = FontWeight.W500,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Spacer(Modifier.width(26.dp))
        Button(
            onClick = {},
            shape = ButtonDefaults.shape,
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkPink
            ),
            modifier = Modifier
                .width(268.dp)
                .height(67.dp)
                .clip(RoundedCornerShape(50.dp))
        ) {
            Text(
                text = "Add to Cart",
                textAlign = TextAlign.Center,
                color = White,
                fontSize = 20.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W500,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DonutsDetailsAddToCardGroupPreview(){
    DonutsDetailsAddToCardGroup()
}