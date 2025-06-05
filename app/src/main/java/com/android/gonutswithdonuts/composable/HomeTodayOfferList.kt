package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.data.todayOffersData
import com.android.gonutswithdonuts.entity.Donuts
import com.android.gonutswithdonuts.ui.theme.Black60pre
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import com.android.gonutswithdonuts.ui.theme.inter
import com.android.gonutswithdonuts.ui.theme.text12
import com.android.gonutswithdonuts.ui.theme.text14
import com.android.gonutswithdonuts.ui.theme.text16
import com.android.gonutswithdonuts.ui.theme.text22

@Composable
fun HomeTodayOffersList(modifier: Modifier){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        modifier = modifier
            .height(325.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(todayOffersData) { donuts ->
            TodayOfferItem(donuts)
        }
    }
}

@Composable
private fun TodayOfferItem(donut: Donuts){
    Box{
        Box (
            modifier = Modifier
                .height(325.dp)
                .width(193.dp)
                .background(color = donut.backgroundColor, shape = RoundedCornerShape(20.dp))
        ){
            Text(
                text = donut.title,
                textAlign = TextAlign.Center,
                color = Black,
                fontSize = getNonScalableFontSize(text16),
                fontFamily = inter,
                fontWeight = FontWeight.W400,
                modifier = Modifier.padding(top = 205.dp, start = 20.dp)
            )
            Text(
                text = donut.description,
                textAlign = TextAlign.Start,
                color = Black60pre,
                fontSize = getNonScalableFontSize(text12),
                fontFamily = inter,
                fontWeight = FontWeight.W300,
                maxLines = 3,
                modifier = Modifier
                    .padding(top = 233.dp, start = 20.dp)
            )
            Text(
                text = donut.price,
                textAlign = TextAlign.Center,
                color = Black,
                fontSize = getNonScalableFontSize(text22),
                fontFamily = inter,
                fontWeight = FontWeight.W500,
                modifier = Modifier.padding(top = 283.dp, start = 138.dp)
            )
            Text(
                text = donut.oldPrice,
                textAlign = TextAlign.Center,
                color = Black60pre,
                fontSize = getNonScalableFontSize(text14),
                fontFamily = inter,
                fontWeight = FontWeight.W500,
                textDecoration = TextDecoration.LineThrough,
                modifier = Modifier.padding(top = 291.dp, start = 105.dp)
            )
        }
        Image(
            painter = painterResource(donut.image),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 49.dp, start = 95.dp)
                .width(137.dp)
                .height(138.dp)
        )
        FavoriteButton(Modifier.padding(top = 15.dp, start = 15.dp))
    }
}

@Composable
private fun FavoriteButton(modifier: Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(35.dp)
            .shadow(0.5.dp, shape = CircleShape,clip = false)
            .background(color = White, shape = CircleShape)
    ) {
        Icon(
            painter = painterResource(R.drawable.round_heart),
            contentDescription = null,
            tint = DarkPink,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Preview(showBackground = true, widthDp = 428)
@Composable
private fun HomeTodayOffersListPreview(){
    HomeTodayOffersList(Modifier)
}