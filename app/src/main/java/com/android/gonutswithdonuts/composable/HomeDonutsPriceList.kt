package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.data.donutsPriceData
import com.android.gonutswithdonuts.entity.Donuts
import com.android.gonutswithdonuts.ui.theme.Black60pre
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import com.android.gonutswithdonuts.ui.theme.inter
import com.android.gonutswithdonuts.ui.theme.text14

@Composable
fun HomeDonutsPriceList(modifier: Modifier){
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
                )
                )
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
                fontSize = getNonScalableFontSize(text14),
                fontFamily = inter,
                fontWeight = FontWeight.W400,
            )
            Text(
                text = donut.price,
                textAlign = TextAlign.Center,
                color = DarkPink,
                fontSize = getNonScalableFontSize(text14),
                fontFamily = inter,
                fontWeight = FontWeight.W500,
            )
        }


    }
}

@Preview(showBackground = true, widthDp = 428)
@Composable
private fun HomeDonutsPriceListPreview(){
    HomeDonutsPriceList(Modifier)
}