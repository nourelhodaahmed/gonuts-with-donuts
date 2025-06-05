package com.android.gonutswithdonuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.composable.DonutsDetailsContentDescription
import com.android.gonutswithdonuts.ui.theme.Background
import com.android.gonutswithdonuts.ui.theme.DarkPink

@Composable
fun DonutsDetails(){
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier.fillMaxSize().background(color = Background)
        ){
            Image(
                painter = painterResource(R.drawable.left_arrow),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .offset(y = 45.dp, x = 32.dp)
                    .align(Alignment.TopStart)
            )
            Image(
                painter = painterResource(R.drawable.detail_donuts),
                contentDescription = null,
                modifier = Modifier
                    .width(725.dp)
                    .height(408.dp)
                    .padding(top = 28.dp)
            )
            DonutsDetailsContentDescription()
            FavoriteButton(
                Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 413.dp, end = 18.dp)
            )
        }
    }
}

@Composable
private fun FavoriteButton(modifier: Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(45.dp)
            .shadow(0.5.dp, shape = RoundedCornerShape(10.dp),clip = false)
            .background(color = White, shape = RoundedCornerShape(10.dp))
    ) {
        Icon(
            painter = painterResource(R.drawable.round_heart),
            contentDescription = null,
            tint = DarkPink,
        )
    }
}

@Preview(showBackground = true, widthDp = 428, heightDp = 926)
@Composable
private fun DonutsDetailsPreview(){
    DonutsDetails()
}