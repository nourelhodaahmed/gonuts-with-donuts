package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.ui.theme.DarkPink
import com.android.gonutswithdonuts.ui.theme.getNonScalableFontSize
import androidx.compose.foundation.layout.Box as Box1

@Composable
fun HomeBottomBar(){
    NavigationBar(
        containerColor = White
    ){
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.round_home),
                    contentDescription = null,
                    tint = DarkPink,
                    modifier = Modifier.size(35.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.round_heart),
                    contentDescription = null,
                    tint = DarkPink,
                    modifier = Modifier.size(35.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.round_notification),
                    contentDescription = null,
                    tint = DarkPink,
                    modifier = Modifier.size(35.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Box(
                    modifier = Modifier.size(37.dp)
                ){
                    Icon(
                        painter = painterResource(R.drawable.round_buy1),
                        contentDescription = null,
                        tint = DarkPink,
                        modifier = Modifier.size(35.dp).align(Alignment.BottomCenter)
                    )
                    Box(
                        modifier = Modifier
                            .size(15.dp)
                            .background(DarkPink, shape = CircleShape)
                            .align(Alignment.TopCenter),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "3",
                            color = White,
                            fontSize = getNonScalableFontSize(9),
                            fontWeight = FontWeight.Light
                        )
                    }
                }

            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.round_info),
                    contentDescription = null,
                    tint = DarkPink,
                    modifier = Modifier.size(35.dp)
                )
            }
        )
    }
}

@Preview(showBackground = true, widthDp = 428, heightDp = 926)
@Composable
private fun HomeBottomBarPreview(){
    HomeBottomBar()
}