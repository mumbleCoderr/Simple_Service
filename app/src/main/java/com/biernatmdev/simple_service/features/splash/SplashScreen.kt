package com.biernatmdev.simple_service.features.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.biernatmdev.simple_service.ui.theme.ColorPrimaryText
import com.biernatmdev.simple_service.ui.theme.ColorSecondary
import com.biernatmdev.simple_service.ui.theme.ColorSecondaryText
import com.biernatmdev.simple_service.ui.theme.ColorSurface

@Composable
fun SplashScreen() {
    val scale = remember { Animatable(0f) }
    LaunchedEffect(
        key1 = true,
        block = {
            scale.animateTo(
                targetValue = 0.7f,
                animationSpec = tween(
                    durationMillis = 600,
                    easing = {
                        OvershootInterpolator(7f)
                            .getInterpolation(it)
                    }
                )
            )
        }
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColorSurface)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SPLASH SCREEN",
            color = ColorPrimaryText
        )
    }
}