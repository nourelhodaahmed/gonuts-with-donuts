package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.gonutswithdonuts.ui.theme.Black60pre
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.inter


@Composable
fun DonutsDetailsContentDescription(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 436.dp)
            .background(color = White, shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
            .padding(40.dp)
    ){
        Column{
            Text(
                text = "Strawberry Wheel",
                textAlign = TextAlign.Start,
                color = DarkPink,
                fontSize = 30.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W500,
            )
            Spacer(Modifier.height(33.dp))
            Text(
                text = "About Gonut",
                textAlign = TextAlign.Start,
                color = Black,
                fontSize = 18.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                textAlign = TextAlign.Start,
                color = Black60pre,
                fontSize = 14.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
                modifier = Modifier.width(348.dp)
            )
            Spacer(Modifier.height(26.dp))
            Text(
                text = "Quantity",
                textAlign = TextAlign.Start,
                color = Black,
                fontSize = 18.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
            )
            Spacer(Modifier.height(19.dp))
            DonutsDetailsQuantityGroup()
            Spacer(Modifier.height(47.dp))
            DonutsDetailsAddToCardGroup()
        }
    }
}

@Preview(showBackground = true, widthDp = 428, heightDp = 926)
@Composable
private fun DonutsDetailsContentDescriptionPreview(){
    DonutsDetailsContentDescription()
}
