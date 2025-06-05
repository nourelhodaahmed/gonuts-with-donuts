package com.android.gonutswithdonuts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.composable.HomeBottomBar
import com.android.gonutswithdonuts.composable.HomeDonutsPriceList
import com.android.gonutswithdonuts.composable.HomeTopAppBar
import com.android.gonutswithdonuts.composable.HomeTodayOffersList
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import com.android.gonutswithdonuts.ui.theme.inter
import com.android.gonutswithdonuts.ui.theme.text20

@Composable
fun Home(){
    Scaffold(
        topBar = { HomeTopAppBar() },
        bottomBar = { HomeBottomBar() },
        containerColor = White,
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).verticalScroll(rememberScrollState()))
        {
            Column{
                Box(
                    modifier = Modifier.fillMaxSize().background(color = White)
                ){
                    Text(
                        text = "Today Offers",
                        textAlign = TextAlign.Start,
                        color = Black,
                        fontSize = getNonScalableFontSize(text20),
                        fontFamily = inter,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier.padding(top = 71.dp, start = 16.dp)
                    )
                    HomeTodayOffersList(Modifier.padding(top = 120.dp, start = 16.dp))
                    Text(
                        text = "Donuts",
                        textAlign = TextAlign.Start,
                        color = Black,
                        fontSize = getNonScalableFontSize(text20),
                        fontFamily = inter,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier.padding(top = 491.dp, start = 16.dp)
                    )
                    HomeDonutsPriceList(Modifier.padding(top = 532.dp, start = 16.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview(){
    Home()
}