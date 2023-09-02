package com.example.didpoolfit.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Logo(hasBackground: Boolean = false, showDescription: Boolean = false) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {
            Text(
                text = "DIDPOOL",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = if (hasBackground) Color.White else MaterialTheme.colorScheme.primary
            )

            Text(
                text = "Fit",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

        }

        if (showDescription)
            Text(
                text = "Everybody Can Train",
                fontSize = 18.sp,
                color = if (hasBackground) Color.White else Color(0XFFB6B4C2),
            )
    }
}

@Preview
@Composable
fun LogoPreview() = Logo(showDescription = true)