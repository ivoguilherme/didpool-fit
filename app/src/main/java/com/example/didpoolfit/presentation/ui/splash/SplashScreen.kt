package com.example.didpoolfit.presentation.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.didpoolfit.presentation.components.GradientButton
import com.example.didpoolfit.presentation.components.Logo

@Composable
fun SplashScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Spacer(modifier = Modifier.height(0.dp))

        Logo(showDescription = true)

        Box(modifier = Modifier.padding(horizontal = 30.dp)) {
            GradientButton(
                text = "Get started",
                onClick = {}
            )

            Spacer(modifier = Modifier.padding(40.dp))
        }
    }
}

@Preview
@Composable
fun SplashScreenPreview() = SplashScreen()