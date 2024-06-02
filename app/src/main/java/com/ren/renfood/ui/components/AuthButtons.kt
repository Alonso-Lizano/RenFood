package com.ren.renfood.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AuthButtons(
    text: String,
    onClick: () -> Unit,
    colors: ButtonColors,
    contentPadding: PaddingValues
) {
    Button(
        onClick = onClick, colors = colors,
        shape = RoundedCornerShape(size = 12.dp),
        modifier = Modifier.fillMaxWidth(),
        contentPadding = contentPadding
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun OutlineButton(
    text: String,
    onClick: () -> Unit,
    colors: ButtonColors,
    borderStroke: BorderStroke,
    contentPadding: PaddingValues
) {
    OutlinedButton(
        onClick = onClick,
        colors = colors,
        shape = RoundedCornerShape(size = 12.dp),
        modifier = Modifier.fillMaxWidth(),
        border = borderStroke,
        contentPadding = contentPadding
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
        )
    }
}