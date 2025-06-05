package com.android.gonutswithdonuts.composable

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.gonutswithdonuts.R
import com.android.gonutswithdonuts.ui.theme.DarkPink

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
                Icon(
                    painter = painterResource(R.drawable.round_buy),
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
                    painter = painterResource(R.drawable.round_info),
                    contentDescription = null,
                    tint = DarkPink,
                    modifier = Modifier.size(35.dp)
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeBottomBarPreview(){
    HomeBottomBar()
}