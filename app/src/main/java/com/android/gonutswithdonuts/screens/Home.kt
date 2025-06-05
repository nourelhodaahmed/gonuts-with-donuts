package com.android.gonutswithdonuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.entity.Donuts
import com.android.gonutswithdonuts.data.donutsPriceData
import com.android.gonutswithdonuts.data.todayOffersData
import com.android.gonutswithdonuts.ui.theme.Background
import com.android.gonutswithdonuts.ui.theme.Black60pre
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.inter

@Composable
fun Home(){
    Box{
        Column (
            Modifier.padding(bottom = 67.dp)
        ){
            Box(
                modifier = Modifier.fillMaxSize().background(color = White).verticalScroll(rememberScrollState())
            ){
                Text(
                    text = "Let’s Gonuts!",
                    textAlign = TextAlign.Start,
                    color = DarkPink,
                    fontSize = 30.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(top = 81.dp, start = 16.dp)
                )
                Text(
                    text = "Order your favourite donuts from here",
                    textAlign = TextAlign.Start,
                    color = Black60pre,
                    fontSize = 14.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.W400,
                    modifier = Modifier.padding(top = 120.dp, start = 16.dp)
                )
                SearchButton(Modifier.padding(top = 84.dp, start = 321.dp))

                Text(
                    text = "Today Offers",
                    textAlign = TextAlign.Start,
                    color = Black,
                    fontSize = 20.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(top = 191.dp, start = 16.dp)
                )
                TodayOffersList(Modifier.padding(top = 240.dp, start = 16.dp))
                Text(
                    text = "Donuts",
                    textAlign = TextAlign.Start,
                    color = Black,
                    fontSize = 20.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.padding(top = 611.dp, start = 16.dp)
                )
                DonutsPriceList(Modifier.padding(top = 652.dp, start = 16.dp))
            }
        }
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = White)
                .align(Alignment.BottomCenter)
                .padding(top = 16.dp, bottom = 16.dp)
        ){
            Image(
                painter = painterResource(R.drawable.round_home),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.round_heart),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.round_notification),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.round_buy),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.round_info),
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
        }
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
        Image(
            painter = painterResource(R.drawable.round_search),
            contentDescription = null,
            )
    }
}

@Composable
private fun TodayOffersList(modifier: Modifier){
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
                fontSize = 16.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
                modifier = Modifier.padding(top = 205.dp, start = 20.dp)
            )
            Text(
                text = donut.description,
                textAlign = TextAlign.Start,
                color = Black60pre,
                fontSize = 12.sp,
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
                fontSize = 22.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W500,
                modifier = Modifier.padding(top = 283.dp, start = 138.dp)
            )
            Text(
                text = donut.oldPrice,
                textAlign = TextAlign.Center,
                color = Black60pre,
                fontSize = 14.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W500,
                modifier = Modifier.padding(top = 291.dp, start = 105.dp).drawBehind {
                    drawLine(
                        color = Black60pre,
                        start = Offset(0f, 25f),
                        end = Offset(size.width, 25f),
                        strokeWidth = 3f
                    )
                }
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
        Image(
            painter = painterResource(R.drawable.round_heart),
            contentDescription = null,
            modifier = Modifier.size(20.dp)
            )
    }
}

@Composable
private fun DonutsPriceList(modifier: Modifier){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        modifier = modifier
            .padding(bottom = 16.dp)
            .height(200.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(21.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(donutsPriceData) { donuts ->
            DonutsPriceItem(donuts)
        }
    }
}

@Composable
private fun DonutsPriceItem(donut: Donuts){
    Box(
        Modifier.height(200.dp)
    ){
        Box(
            modifier = Modifier
                .width(138.dp)
                .height(111.dp)
                .shadow(2.dp, shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomEnd = 10.dp,
                    bottomStart = 10.dp
                ),
                    clip = false)
                .background(color = White, shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomEnd = 10.dp,
                    bottomStart = 10.dp
                ))
                .align(Alignment.BottomCenter)
        ){}

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(donut.image),
                contentDescription = null,
            )
            Text(
                text = donut.title,
                textAlign = TextAlign.Center,
                color = Black60pre,
                fontSize = 14.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W400,
            )
            Text(
                text = donut.price,
                textAlign = TextAlign.Center,
                color = DarkPink,
                fontSize = 14.sp,
                fontFamily = inter,
                fontWeight = FontWeight.W500,
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview(){
    Home()
}