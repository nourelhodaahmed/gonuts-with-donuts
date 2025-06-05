package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.ui.theme.Background
import com.android.gonutswithdonuts.ui.theme.Black60pre
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import com.android.gonutswithdonuts.ui.theme.inter
import com.android.gonutswithdonuts.ui.theme.text14
import com.android.gonutswithdonuts.ui.theme.text30


@Composable
fun HomeTopAppBar(){
    Box(
        Modifier.fillMaxWidth()
            .padding(bottom = 20.dp)
    ){
        Text(
            text = "Let’s Gonuts!",
            textAlign = TextAlign.Start,
            color = DarkPink,
            fontSize = getNonScalableFontSize(text30),
            fontFamily = inter,
            fontWeight = FontWeight.W500,
            modifier = Modifier.padding(top = 81.dp, start = 16.dp)
        )
        Text(
            text = "Order your favourite donuts from here",
            textAlign = TextAlign.Start,
            color = Black60pre,
            fontSize = getNonScalableFontSize(text14),
            fontFamily = inter,
            fontWeight = FontWeight.W400,
            modifier = Modifier.padding(top = 120.dp, start = 16.dp)
        )
        SearchButton(
            Modifier
            .align(Alignment.TopEnd)
            .padding(top = 84.dp, start = 343.dp, end = 40.dp)
        )
    }
}

@Composable
private fun SearchButton(modifier: Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(45.dp)
            .shadow(0.5.dp, shape = RoundedCornerShape(10.dp),clip = false)
            .background(color = Background, shape = RoundedCornerShape(10.dp))
    ) {
        Icon(
            painter = painterResource(R.drawable.round_search),
            contentDescription = null,
            tint = DarkPink,
        )
    }
}

@Preview(showBackground = true, widthDp = 428, heightDp = 926)
@Composable
private fun HomeTopBarPreview(){
    HomeTopAppBar()
}