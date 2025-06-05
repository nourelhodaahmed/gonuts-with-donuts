package com.android.gonutswithdonuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.ui.theme.Background
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.LightPink
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import com.android.gonutswithdonuts.ui.theme.inter
import com.android.gonutswithdonuts.ui.theme.text18
import com.android.gonutswithdonuts.ui.theme.text20
import com.android.gonutswithdonuts.ui.theme.text54

@Composable
fun Starter(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Background)
            .padding(bottom = 20.dp)
            .verticalScroll(rememberScrollState())
    ){
        Image(
            painter = painterResource(R.drawable.donut_with_pink_icing),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 185.dp, top = 40.dp)
                .width(210.dp)
                .height(155.dp)
        )
        Image(
            painter = painterResource(R.drawable.donuts_background),
            contentDescription = null,
            modifier = Modifier
                .rotate(-1f)
                .offset(y=(27.6).dp)
        )
        Image(
            painter = painterResource(R.drawable.donut_with_pink_icing),
            contentDescription = null,
            modifier = Modifier
            .size(99.dp)
            .offset(y = 260.dp)
            .padding(top = 40.dp)
            .rotate(70f)
        )
        Image(
            painter = painterResource(R.drawable.purpledonut),
            contentDescription = null,
            modifier = Modifier
                .size(160.dp)
                .offset(x = (-19).dp, y = (-39).dp)
        )
        Image(
            painter = painterResource(R.drawable.halfdonut),
            contentDescription = null,
            modifier = Modifier
                .height(165.dp)
                .align(Alignment.CenterEnd)
        )
        Text(
            text = "Gonuts with Donuts",
            textAlign = TextAlign.Start,
            color = DarkPink,
            fontSize = getNonScalableFontSize(text54),
            fontFamily = inter,
            maxLines = 4,
            fontWeight = FontWeight.W600,
            modifier = Modifier
                .padding(start = 40.dp, top = 451.dp)
                .width(193.dp)
        )
        Text(
            text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
            textAlign = TextAlign.Start,
            color = LightPink,
            fontSize = getNonScalableFontSize(text18),
            fontFamily = inter,
            fontWeight = FontWeight.W400,
            modifier = Modifier
                .padding(start = 40.dp, top = 665.dp)
                .width(348.dp)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(top = 813.dp)
                .background(color = White, shape = RoundedCornerShape(50.dp))
                .width(348.dp)
                .height(67.dp)
                .align(Alignment.BottomCenter)
        ){
            Text(
                text = "Get Started",
                textAlign = TextAlign.Center,
                color = Black,
                maxLines = 1,
                fontSize = getNonScalableFontSize(text20),
                fontFamily = inter,
                fontWeight = FontWeight.W500,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StarterPreview(){
    Starter()
}