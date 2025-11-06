package com.biernatmdev.simple_service.features.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.biernatmdev.simple_service.R
import com.biernatmdev.simple_service.ui.theme.ColorBtnText
import com.biernatmdev.simple_service.ui.theme.ColorPrimary
import com.biernatmdev.simple_service.ui.theme.FontSize.SEMI_LARGE
import com.biernatmdev.simple_service.ui.theme.momoFont

@Composable
fun Button(
    modifier: Modifier = Modifier,
    backgroundColor: Color = ColorPrimary,
    imageVector: ImageVector? = null,
    painterResource: Int? = null,
    btnText: String,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        color = backgroundColor
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 16.dp, 32.dp, 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = btnText,
                color = ColorBtnText,
                fontFamily = momoFont(),
                fontSize = SEMI_LARGE,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.width(24.dp))
            when {
                imageVector != null -> {
                    Icon(
                        imageVector = imageVector,
                        contentDescription = imageVector.name,
                        tint = ColorBtnText,
                        modifier = Modifier
                            .size(32.dp)
                            .align(Alignment.CenterEnd)
                    )
                }

                painterResource != null -> {
                    Icon(
                        painter = painterResource(painterResource),
                        contentDescription = painterResource.toString(),
                        tint = ColorBtnText,
                        modifier = Modifier
                            .size(32.dp)
                            .align(Alignment.CenterEnd)
                    )
                }
            }
        }
    }
}