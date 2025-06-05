package com.android.gonutswithdonuts.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun getNonScalableFontSize(fontSize: Int): TextUnit{
    val fontScale = LocalDensity.current.fontScale
    return (fontSize/ fontScale).sp
}

@Composable
fun getNonScalableFontSize(fontSize: Float): TextUnit{
    val fontScale = LocalDensity.current.fontScale
    return (fontSize/ fontScale).sp
}

val text20 = 20
val text54 = 54
val text18 = 18
val text30 = 30
val text14 = 14
val text16 = 16
val text12 = 12
val text22 = 22